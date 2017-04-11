package com.pvags.config;

import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@MapperScan("com.pvags.mappers")
public class DBConfig {

    @Autowired
    public Environment env;

    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSourceProduction());
    }

    @Bean(name = "sessionFactory")
    @Profile("prod")
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSourceProduction());
        return sessionFactory.getObject();
    }
    
    @Bean(name = "sessionFactory")
    @Profile("dev")
    public SqlSessionFactory sqlSessionFactoryP() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSourceDev());
        return sessionFactory.getObject();
    }
    
    @Bean(name = "dataSource")
    @Profile("dev")
    public DataSource dataSourceDev() {
        BasicDataSource dS = new BasicDataSource();
        dS.setDriverClassName(env.getProperty("db.test.driver"));
        dS.setUrl(env.getProperty("db.test.url"));
        dS.setUsername(env.getProperty("db.test.user"));
        dS.setPassword(env.getProperty("db.test.password"));
        dS.setInitialSize(10);
        dS.setMaxActive(20);
        dS.setMaxIdle(10);
        dS.setMinIdle(5);
        return dS;
    }

    @Bean(name = "dataSource")
    @Profile("prod")
    public DataSource dataSourceProduction() {
        BasicDataSource dS = new BasicDataSource();
        dS.setDriverClassName(env.getProperty("db.prod.driver"));
        dS.setUrl(env.getProperty("db.prod.url"));
        dS.setUsername(env.getProperty("db.prod.user"));
        dS.setPassword(env.getProperty("db.prod.password"));
        dS.setInitialSize(10);
        dS.setMaxActive(20);
        dS.setMaxIdle(10);
        dS.setMinIdle(5);
        return dS;
    }

    @Bean(name = "jdbcTemplate")
    @Profile("dev")
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSourceDev());
    }

    @Bean(name = "jdbcTemplate")
    @Profile("prod")
    public JdbcTemplate jdbcTemplateP() {
        return new JdbcTemplate(dataSourceProduction());
    }
    
    /* Esquemas en pruebas */
    @Bean(name = "schema")
    @Profile({"dev","services"})
    public String getSchemaAct(){
        return env.getProperty("db.test.schema_services");
    }
    
    /* Esquemas en produccion */
    @Bean(name = "schema")
    @Profile({"prod","services"})
    public String getSchemaActP(){
        return env.getProperty("db.prod.schema_services");
    }
    
    
}

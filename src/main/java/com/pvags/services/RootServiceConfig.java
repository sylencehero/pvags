package com.pvags.services;

import com.pvags.config.DBRootConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({"com.pvags.services","com.pvags.daos"})
@Import({DBRootConfig.class})
public class RootServiceConfig {
    
}

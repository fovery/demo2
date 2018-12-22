package com.example.demo.cnfig;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBatisScannerConfig {
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer ms=new MapperScannerConfigurer();
        ms.setBasePackage("com.example.demo.dao");
        ms.setSqlSessionFactoryBeanName("sqlSessionFactory");
        return ms;

    }
}

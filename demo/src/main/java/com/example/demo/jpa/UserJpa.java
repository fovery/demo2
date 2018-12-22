package com.example.demo.jpa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Component;

import java.io.Serializable;
@ComponentScan
public interface UserJpa extends
        JpaRepository<UserEntity,Long>,JpaSpecificationExecutor<UserEntity>, Serializable
{

    void deleteById(Integer id);
}



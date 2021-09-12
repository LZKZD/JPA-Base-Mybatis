package com.business.demo.article.config;

import com.business.demo.article.jpa.BaseRepositoryFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(repositoryFactoryBeanClass = BaseRepositoryFactoryBean.class,basePackages = {"com.business.demo.article.jpa", "com.business"})
public class JpaConfig {


}


package com.nearsoft.spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.context.annotation.ComponentScan.Filter;

/**
 * Created by vtorres on 28/06/15.
 */
@Configuration
@ComponentScan(basePackages = {"com.nearsoft.spring"}, excludeFilters = {
        @Filter(type = FilterType.ANNOTATION, value=EnableWebMvc.class)})
public class RootConfig {

}

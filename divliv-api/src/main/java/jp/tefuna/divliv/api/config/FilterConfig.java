package jp.tefuna.divliv.api.config;

import javax.servlet.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jp.tefuna.divliv.api.filter.LoggingFilter;
import jp.tefuna.divliv.api.filter.RequestIdFilter;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<Filter> requestIdFilter() {
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>(new RequestIdFilter());
        bean.setOrder(1);
        return bean;
    }

    @Bean
    public FilterRegistrationBean<Filter> loggingFilter() {
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>(new LoggingFilter());
        bean.setOrder(2);
        return bean;
    }

}

package jp.tefuna.divliv.api.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBatisConfig {

    @Bean
    ConfigurationCustomizer mybatisConfigurationCustomizer() {
        return (configuration) -> {
            // aplication.propertiesで指定・表現できないカスタマイズコードを実装
            // configuration.getTypeHandlerRegistry().register(RoundingMode.class, EnumOrdinalTypeHandler.class);
        };
    }

}

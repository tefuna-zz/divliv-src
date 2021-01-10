package jp.tefuna.divliv.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;

@Configuration
public class JacksonConfig {

    @Bean
    public Jackson2ObjectMapperBuilder objectMapperBuilder() {
        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();

        // 値がnullのプロパティーを出力しない
        builder.serializationInclusion(JsonInclude.Include.NON_NULL);

        // JSON出力時に改行・インデントを入れる
        builder.indentOutput(true);

        return builder;
    }

}

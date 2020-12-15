package jp.tefuna.divliv.api.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * SpringBoot main.
 * @author tefuna
 */
@SpringBootApplication
@ComponentScan("jp.tefuna.divliv.api")
@MapperScan(basePackages = {"jp.tefuna.divliv.api.repository"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

package jp.tefuna.divlife.api.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * SpringBoot main.
 *
 * @author tefuna
 */
@SpringBootApplication
@ComponentScan("jp.tefuna.divlife.api")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

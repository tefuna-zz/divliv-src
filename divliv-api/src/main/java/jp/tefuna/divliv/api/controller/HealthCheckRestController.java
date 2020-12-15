package jp.tefuna.divliv.api.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jp.tefuna.divliv.api.consts.CtrlConst;
import jp.tefuna.divliv.api.dto.controller.healthcheck.HealthCheckResponseElement;
import lombok.extern.slf4j.Slf4j;

/**
 * HealthCheckRestController.
 * @author tefuna
 */
@RestController
@RequestMapping(value = CtrlConst.HEALTH_CHECK)
@Slf4j
public class HealthCheckRestController {

    /** aaa.a. */
    @Value("${aaa.aaa}")
    private String aaa;

    /** aaa.b. */
    @Value("${aaa.bbb}")
    private int bbb;

    // TODO コントローラ標準化
    /**
     * healthcheck.
     * @return response
     */
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public HealthCheckResponseElement healthcheck() {

        log.info("ああああああああああああああああ");

        log.info("controller start");
        // log.error("aaaa", new Throwable());

        HealthCheckResponseElement elem = new HealthCheckResponseElement();

        elem.setStatus(HttpStatus.OK.value());
        elem.setMessage("health check OK.");

        // TODO 日付util
        LocalDateTime ldt = LocalDateTime.now();
        elem.setTimestamp(ldt.toString());

        log.info("controller end");

        return elem;
    }
}

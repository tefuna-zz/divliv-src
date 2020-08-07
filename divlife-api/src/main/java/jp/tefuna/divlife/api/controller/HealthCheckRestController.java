package jp.tefuna.divlife.api.controller;

// TODO インポート文の編成。改行をはさみたい
import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import jp.tefuna.divlife.api.consts.CtrlConst;
import jp.tefuna.divlife.api.dto.controller.healthcheck.HealthCheckResponseElement;

/**
 * HealthCheckRestController.
 *
 * @author tefuna
 */
@RestController
@RequestMapping(value = CtrlConst.HEALTH_CHECK)
public class HealthCheckRestController {

    // TODO コントローラ標準化
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public HealthCheckResponseElement healthcheck() {
        HealthCheckResponseElement elem = new HealthCheckResponseElement();
        elem.setStatus(HttpStatus.OK.value());
        elem.setMessage("health check OK.");

        // TODO 日付util
        LocalDateTime ldt = LocalDateTime.now();
        elem.setTimestamp(ldt.toString());

        return elem;
    }
}

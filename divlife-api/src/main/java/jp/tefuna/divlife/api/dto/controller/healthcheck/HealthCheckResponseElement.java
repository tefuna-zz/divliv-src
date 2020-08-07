package jp.tefuna.divlife.api.dto.controller.healthcheck;

import lombok.Data;

/**
 * HealthCheckRestControllerレスポンス
 *
 * @author tefuna
 */
@Data
public class HealthCheckResponseElement {

    private int status;
    private String message;
    private String timestamp;

}

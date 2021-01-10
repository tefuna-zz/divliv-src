package jp.tefuna.divliv.api.resource;

import lombok.Data;

@Data
public class ErrorDetail {

    private String id;
    private String code;
    private String message;

}

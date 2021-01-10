package jp.tefuna.divliv.api.resource;

import java.util.List;

import lombok.Data;

@Data
public class Error {

    private String id;
    private String code;
    private String message;
    private List<ErrorDetail> errors;

}

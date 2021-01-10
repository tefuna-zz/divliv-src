package jp.tefuna.divliv.api.resource.rate;

import lombok.Data;

@Data
public class RateResponse {


    private RateResource result;
    private Error error;

}

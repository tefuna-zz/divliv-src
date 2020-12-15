package jp.tefuna.divliv.api.resource.sample;

import java.util.List;

import lombok.Data;

@Data
public class SampleRequest {

    private List<SampleResource> samples;

}

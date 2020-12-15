package jp.tefuna.divliv.api.service.sample;

import jp.tefuna.divliv.api.service.ServiceIn;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SampleAddIn implements ServiceIn {

    private String id;
    private String name;

}

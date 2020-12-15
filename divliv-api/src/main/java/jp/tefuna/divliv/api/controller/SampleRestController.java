package jp.tefuna.divliv.api.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jp.tefuna.divliv.api.resource.sample.SampleRequest;
import jp.tefuna.divliv.api.service.sample.SampleAddIn;
import jp.tefuna.divliv.api.service.sample.SampleService;
import lombok.extern.slf4j.Slf4j;

/**
 * SampleContoller.
 * @author tefuna
 */
@RestController
@RequestMapping("/sample")
@Slf4j
public class SampleRestController extends BaseController {

    @Autowired
    SampleService sampleService;

    /**
     * sample.
     * @param samples list of sample.
     * @return string
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String sample(@RequestBody SampleRequest samples) {

        log.info("ああああああああああああああああ");

        var id = "111";
        var name = "name";

        SampleAddIn in = SampleAddIn.builder()
                .id(id)
                .name(name)
                .build();
        BeanUtils.copyProperties(samples.getSamples().get(0), samples);

        sampleService.add(in);
        // SampleServiceIn
        return "saaasss";
    }

}

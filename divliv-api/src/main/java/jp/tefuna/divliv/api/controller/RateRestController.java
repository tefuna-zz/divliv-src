package jp.tefuna.divliv.api.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jp.tefuna.divliv.api.resource.rate.RateResource;
import jp.tefuna.divliv.api.resource.rate.RateResponse;
import jp.tefuna.divliv.api.resource.sample.SampleRequest;
import jp.tefuna.divliv.api.service.sample.SampleAddIn;
import jp.tefuna.divliv.api.service.sample.SampleService;
import lombok.extern.slf4j.Slf4j;

/**
 * RateController.
 * @author tefuna
 */
@RestController
@RequestMapping("/rates")
@Slf4j
public class RateRestController extends BaseController {

    // @Autowired
    // SampleService sampleService;

    /**
     * get.
     * @param date     baseDate
     * @param currency currency
     * @return
     */
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public RateResponse get(@RequestParam(name = "date") String date,
            @RequestParam(name = "cuurency") String currency) {

        log.info("ああああああああああああああああ");

        RateResponse res = new RateResponse();
        RateResource rate = new RateResource();
        rate.setBaseDate("aaaa");
        rate.setCurrency("JPY");
        rate.setRateId("id001");
        rate.setRate("aaa");
        rate.setCreatedAt("2020");
        rate.setUpdatedAt("2021");
        res.setResult(rate);

        // var id = "111";
        // var name = "name";
        //
        // SampleAddIn in = SampleAddIn.builder()
        // .id(id)
        // .name(name)
        // .build();
        // BeanUtils.copyProperties(samples.getSamples()
        // .get(0), samples);
        //
        // sampleService.add(in);
        // // SampleServiceIn
        return res;
    }

}

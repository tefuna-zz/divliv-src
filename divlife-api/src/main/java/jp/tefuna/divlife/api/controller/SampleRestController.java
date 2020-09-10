package jp.tefuna.divlife.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jp.tefuna.divlife.api.resource.sample.SampleRequest;
import jp.tefuna.divlife.api.service.sample.SampleService;

/**
 * SampleContoller.
 * @author tefuna
 */
@RestController
@RequestMapping("/sample")
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

        var id = "111";
        var name = "name";

        sampleService.add(id, name);
        // SampleServiceIn
        return "saaasss";
    }

}

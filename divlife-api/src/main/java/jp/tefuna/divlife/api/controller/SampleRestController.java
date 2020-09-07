package jp.tefuna.divlife.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import jp.tefuna.divlife.api.service.sample.SampleService;

/**
 * SampleContoller.
 *
 * @author tefuna
 */
@RestController
@RequestMapping("/sample")
public class SampleRestController extends BaseController {

    @Autowired
    SampleService SampleService;



    /**
     * sample.
     *
     * @return string
     */
    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String sample() {

        // SampleServiceIn
        return "saaasss";
    }

}

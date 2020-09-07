package jp.tefuna.divlife.api.service.sample.impl;

import org.springframework.stereotype.Service;

import jp.tefuna.divlife.api.service.BaseService;
import jp.tefuna.divlife.api.service.sample.SampleService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SampleServiceImpl extends BaseService implements SampleService {

    @Override
    public void add(String id, String sample) {
        log.info("SampleServiceImpl#add");

    }

    @Override
    public void subtract() {

    }

    @Override
    public void get() {

    }

    public <T> T aaa() {
        return null;
    }

}

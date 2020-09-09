package jp.tefuna.divlife.api.service.sample.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.tefuna.divlife.api.repository.SampleRepository;
import jp.tefuna.divlife.api.service.BaseService;
import jp.tefuna.divlife.api.service.sample.SampleService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SampleServiceImpl extends BaseService implements SampleService {

    @Autowired
    SampleRepository sampleRepository;


    @Override
    @Transactional
    public void add(String id, String sample) {
        log.info("SampleServiceImpl#add start.");
        var ent = sampleRepository.findById(id);
        log.info("SampleServiceImpl#add end.");
    }

    @Override
    public void subtract() {
    }

    @Override
    public void get() {

    }


}

package jp.tefuna.divliv.api.service.sample.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.tefuna.divliv.api.repository.SampleRepository;
import jp.tefuna.divliv.api.service.BaseService;
import jp.tefuna.divliv.api.service.sample.SampleAddIn;
import jp.tefuna.divliv.api.service.sample.SampleService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SampleServiceImpl extends BaseService implements SampleService {

    @Autowired
    SampleRepository sampleRepository;

    @Override
    @Transactional
    public void add(SampleAddIn in) {
        log.info("SampleServiceImpl#add start. {}", in);

        // var ent = sampleRepository.findById(id);
        log.info("SampleServiceImpl#add end. {}", in);
    }

    public void subtract() {}

    @Override
    public void get() {

    }

}

package jp.tefuna.divliv.api.service.sample;

import org.springframework.transaction.annotation.Transactional;

/**
 * SampleService.
 * @author tefuna
 */
public interface SampleService {

    /**
     * aaaa.
     * @param id   id
     * @param name name
     */
    @Transactional
    void add(SampleAddIn in);

    void subtract();

    void get();
}

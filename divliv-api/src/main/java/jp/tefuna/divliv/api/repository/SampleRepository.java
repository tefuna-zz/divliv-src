package jp.tefuna.divliv.api.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import jp.tefuna.divliv.api.entity.SampleEntity;

/**
 * @author tefuna
 */
@Repository
@Mapper
public interface SampleRepository {

    @Select("SELECT * FROM pfm.aaa ORDER BY id")
    SampleEntity findById(@Param(value = "id") String id);

}

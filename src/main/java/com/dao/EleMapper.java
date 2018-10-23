package com.dao;

import com.domain.Ele;
import com.domain.EleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EleMapper {
    int countByExample(EleExample example);

    int deleteByExample(EleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ele record);

    int insertSelective(Ele record);

    List<Ele> selectByExample(EleExample example);

    Ele selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ele record, @Param("example") EleExample example);

    int updateByExample(@Param("record") Ele record, @Param("example") EleExample example);

    int updateByPrimaryKeySelective(Ele record);

    int updateByPrimaryKey(Ele record);
}
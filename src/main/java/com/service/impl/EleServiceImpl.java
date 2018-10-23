package com.service.impl;

import com.dao.EleMapper;
import com.service.IEleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EleServiceImpl implements IEleService {
    @Autowired
    private EleMapper eleMapper;

    @Override
    public int select(int id) {
       return eleMapper.selectByPrimaryKey(id).getId();
    }
}

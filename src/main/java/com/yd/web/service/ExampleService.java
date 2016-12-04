package com.yd.web.service;

import com.yd.web.bean.LogStash;
import com.yd.web.mapper.LogStashMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wubo on 2016/12/1.
 */
@Service
public class ExampleService {

    @Autowired
    private LogStashMapper logStashMapper;

    public String test(String param) {
        System.out.println("=================" + param + "====================");
        return param;
    }

    public LogStash getLogstash(String id){
        return logStashMapper.findById(id);
    }

    public int insertLogstash(LogStash logStash){
        return logStashMapper.create(logStash);
    }
}

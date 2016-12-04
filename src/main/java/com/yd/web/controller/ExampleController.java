package com.yd.web.controller;

import com.yd.web.bean.Example;
import com.yd.web.bean.LogStash;
import com.yd.web.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wubo on 2016/12/1.
 */
@RestController
public class ExampleController {

    @Autowired
    ExampleService exampleService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(String param) {
        System.out.println("============================");
        exampleService.test(param);
        return "Hello World!";
    }

    @RequestMapping(value = "/getExample", method = RequestMethod.GET)
    public Example getExample(String name) {
        Example example = new Example();
        example.setName(name);
        return example;
    }

    @RequestMapping(value = "/getLogs", method = RequestMethod.GET)
    public LogStash getLogs(String id) {
        return exampleService.getLogstash(id);
    }

}

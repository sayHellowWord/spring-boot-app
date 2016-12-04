package com.yd.schedule;

import com.yd.web.bean.LogStash;
import com.yd.web.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Random;

/**
 * Created by wubo on 2016/12/4.
 */
@Component
public class ScheduledTasks {


    private static int id = 1000000;

    private static int logs1 = 300000000;

    private static int logs2 = 500000000;

    private static int logs3 = 700000000;

    private static int logs4 = 900000000;


    @Autowired
    ExampleService exampleService;

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        LogStash logStash = new LogStash();
        logStash.setId(++id);
        logStash.setUserId("mac-" + new Random().nextInt(100000) + "");
        logStash.setGroupId(new Random().nextInt(999999999));
        logStash.setVoteId(new Random().nextInt(999999999));
        logStash.setCreateTime(new Date());
        exampleService.insertLogstash(logStash);
    }
//
//    @Scheduled(fixedRate = 5000)
//    public void logs1() {
//        LogStash logStash = new LogStash();
//        logStash.setId(logs1);
//        logStash.setUserId("logs1-" + new Random().nextInt(100000));
//        logStash.setGroupId(new Random().nextInt(999999999));
//        logStash.setVoteId(new Random().nextInt(999999999));
//        logStash.setCreateTime(new Date());
//        exampleService.insertLogstash(logStash);
//    }
//
//    @Scheduled(fixedRate = 5000)
//    public void logs4() {
//        LogStash logStash = new LogStash();
//        logStash.setId(logs4);
//        logStash.setUserId("logs4-" + new Random().nextInt(100000));
//        logStash.setGroupId(new Random().nextInt(999999999));
//        logStash.setVoteId(new Random().nextInt(999999999));
//        logStash.setCreateTime(new Date());
//        exampleService.insertLogstash(logStash);
//    }
//
//    @Scheduled(fixedRate = 5000)
//    public void logs2() {
//        LogStash logStash = new LogStash();
//        logStash.setId(logs2);
//        logStash.setUserId("logs2-" + new Random().nextInt(100000));
//        logStash.setGroupId(new Random().nextInt(999999999));
//        logStash.setVoteId(new Random().nextInt(999999999));
//        logStash.setCreateTime(new Date());
//        exampleService.insertLogstash(logStash);
//    }
//
//    @Scheduled(fixedRate = 5000)
//    public void logs3() {
//        LogStash logStash = new LogStash();
//        logStash.setId(logs3);
//        logStash.setUserId("logs3-" + new Random().nextInt(100000));
//        logStash.setGroupId(new Random().nextInt(999999999));
//        logStash.setVoteId(new Random().nextInt(999999999));
//        logStash.setCreateTime(new Date());
//        exampleService.insertLogstash(logStash);
//    }


}

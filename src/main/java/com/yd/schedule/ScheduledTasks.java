package com.yd.schedule;

import com.yd.web.bean.LogStash;
import com.yd.web.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by wubo on 2016/12/4.
 */
@Component
public class ScheduledTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    private static int id = 10000;

    @Autowired
    ExampleService exampleService;

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("现在时间：" + dateFormat.format(new Date()));
        LogStash logStash = new LogStash();
        logStash.setId(++id);
        logStash.setUserId(new Random().nextInt(100000) + "");
        logStash.setGroupId(new Random().nextInt(999999999));
        logStash.setVoteId(new Random().nextInt(999999999));
        logStash.setCreateTime(new Date());
        exampleService.insertLogstash(logStash);
    }

}

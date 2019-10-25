package com.barry.home.scheduleTasks.ScheduledTasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Tasks {

    private static final Logger logger = LoggerFactory.getLogger(Tasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("[yyyy/MM/dd] HH:mm:ss");

    @Scheduled(cron = "${cron.expression}")
    public void reportCurrentTime(){
        logger.info("The time is now {}", dateFormat.format(new Date()));
    }
}

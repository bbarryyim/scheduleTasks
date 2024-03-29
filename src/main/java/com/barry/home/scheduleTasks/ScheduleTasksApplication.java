package com.barry.home.scheduleTasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ScheduleTasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScheduleTasksApplication.class, args);
	}
}

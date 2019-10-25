# scheduleTasks

This program is a simple demo in utilizing the Spring Scheduling Annotations. 

1. Firstly, a Spring Boot applicaion was created using the [Spring Initializer](https://start.spring.io/)
2. To schedule job in spring boot - Spring Boot provides @EnableScheduling and @Scheduled annotations. 
* The @EnableScheduling annotation is added to the spring boot application class 
* The Task class is decorated with @Component - to be detected during component scan process and registered as a Spring bean
* Inside the Task class, the @Scheduled annotation is placed on the reportCurrentTime method 

3. The @Schedule annotation can execute tasks at Fixed rate, Fixed delay or by cron expression



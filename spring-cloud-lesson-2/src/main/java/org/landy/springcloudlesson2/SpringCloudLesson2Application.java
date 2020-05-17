package org.landy.springcloudlesson2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudLesson2Application {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(SpringCloudLesson2Application.class);
		springApplication.setWebEnvironment(true);
		springApplication.run(args);
	}
}

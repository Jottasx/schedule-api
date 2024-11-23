package com.atac.schedule_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/*
 * © ${2024} Jarbas Vitor Pereira Montenegro & João Pedro. All rights reserved.
 */

@SpringBootApplication
@Profile("dev")
@EnableJpaAuditing
public class ScheduleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScheduleApiApplication.class, args);
	}

}

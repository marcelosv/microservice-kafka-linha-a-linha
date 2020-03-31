package br.com.marcelosv.kafkaline.ibgeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@EnableKafka
@EnableCaching
public class IbgeserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IbgeserviceApplication.class, args);
	}

}

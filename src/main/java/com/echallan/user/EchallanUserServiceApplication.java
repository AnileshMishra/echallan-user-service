package com.echallan.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Anilesh Mishra
 *
 */

@SpringBootApplication
@EnableFeignClients
@EnableSwagger2
public class EchallanUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EchallanUserServiceApplication.class, args);
	}

}

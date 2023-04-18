package com.echallan.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Anilesh Mishra
 *
 */

@SpringBootApplication
@EnableFeignClients
public class EchallanUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EchallanUserServiceApplication.class, args);
	}

}

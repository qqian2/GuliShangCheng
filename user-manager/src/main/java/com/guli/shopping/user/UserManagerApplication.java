package com.guli.shopping.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.guli.shopping.user.mapper")
public class UserManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagerApplication.class, args);
	}

}

package com.five.monkey.vi.vhr;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages = { "com.five.monkey.vi.vhr.dubbo" })
public class ViVhrDubboApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViVhrDubboApplication.class, args);
	}

}

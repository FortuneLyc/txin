package com.lyc.txin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication(scanBasePackages={"com.act"},exclude={JacksonAutoConfiguration.class})
@ServletComponentScan(basePackages = "com.act")
@EnableCaching
public class TxinWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(TxinWebApplication.class, args);
	}

}

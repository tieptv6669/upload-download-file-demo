package com.uploaddownload.filedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.uploaddownload.filedemo.properties.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({FileStorageProperties.class})
public class FileDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileDemoApplication.class, args);
	}

}

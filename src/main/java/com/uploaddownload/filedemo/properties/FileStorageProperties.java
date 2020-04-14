package com.uploaddownload.filedemo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

// binds all the properties with prefix "file" to the corresponding fields of the POJO class
@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {
	private String uploadDir;

	public String getUploadDir() {
		return uploadDir;
	}

	public void setUploadDir(String uploadDir) {
		this.uploadDir = uploadDir;
	}
}

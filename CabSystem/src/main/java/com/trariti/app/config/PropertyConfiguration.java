package com.trariti.app.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties("limits-service")
@Component
public class PropertyConfiguration {
	
	private int minimum;
	private int maximum;
}

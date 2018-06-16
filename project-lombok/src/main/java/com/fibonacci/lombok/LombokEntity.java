package com.fibonacci.lombok;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class LombokEntity {

	private String name;
	private Long id;

}

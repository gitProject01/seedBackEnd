package com.seedbackend.service;
import javax.inject.Named;


@Named
public class MessageServerBean {
	public String getMessage() {
		return "message Context Dependency Injection";
	}
}
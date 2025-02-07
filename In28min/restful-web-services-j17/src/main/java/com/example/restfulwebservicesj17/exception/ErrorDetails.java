package com.example.restfulwebservicesj17.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;

class ErrorDetails {
	private LocalDateTime timestampDate;
	private String message;
	private String details;
	
	public ErrorDetails(LocalDateTime timestampDate, String message, String details) {
		super();
		this.timestampDate = timestampDate;
		this.message = message;
		this.details = details;
	}
	
	public LocalDateTime getTimestampDate() {
		return timestampDate;
	}
	public String getMessage() {
		return message;
	}
	public String getDetails() {
		return details;
	}
}

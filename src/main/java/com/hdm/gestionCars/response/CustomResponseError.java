package com.hdm.gestionCars.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CustomResponseError {
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy hh:mm:ss", timezone = "Africa/Casablanca")
	private Date timestamp;
	private int httpStatusCode;
	private String message;

	public CustomResponseError(int httpStatusCode, String message) {
		this.httpStatusCode = httpStatusCode;
		this.message = message;
		this.timestamp = new Date();
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public int getHttpStatusCode() {
		return httpStatusCode;
	}

	public void setHttpStatusCode(int httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

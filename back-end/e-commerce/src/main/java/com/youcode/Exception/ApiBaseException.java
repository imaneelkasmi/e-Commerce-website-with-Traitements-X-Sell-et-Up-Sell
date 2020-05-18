package com.youcode.Exception;

import org.springframework.http.HttpStatus;

public abstract class ApiBaseException extends RuntimeException {

	private static final long serialVersionUID = -9160999423600684717L;

	public ApiBaseException(String message) {
        super(message);
    }

    public abstract HttpStatus getStatusCode();

}
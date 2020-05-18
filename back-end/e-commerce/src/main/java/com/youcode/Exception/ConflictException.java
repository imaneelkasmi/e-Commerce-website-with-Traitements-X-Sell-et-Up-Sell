package com.youcode.Exception;

import org.springframework.http.HttpStatus;

public class ConflictException extends ApiBaseException {


	private static final long serialVersionUID = 7821944582322969483L;

	public ConflictException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getStatusCode() {
        return HttpStatus.CONFLICT;
    }
}

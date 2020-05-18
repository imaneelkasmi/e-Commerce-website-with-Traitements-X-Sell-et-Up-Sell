package com.youcode.Exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends ApiBaseException {

	private static final long serialVersionUID = -4742348512396679262L;

	public NotFoundException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getStatusCode() {
        return HttpStatus.NOT_FOUND;
    }
}

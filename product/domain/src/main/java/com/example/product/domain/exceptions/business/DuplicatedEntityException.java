package com.example.product.domain.exceptions.business;

public class DuplicatedEntityException extends RuntimeException {

	public DuplicatedEntityException(String message) {
		super(message);
	}
}

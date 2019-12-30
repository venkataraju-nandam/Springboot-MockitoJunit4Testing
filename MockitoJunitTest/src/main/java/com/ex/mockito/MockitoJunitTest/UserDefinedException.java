package com.ex.mockito.MockitoJunitTest;

import ch.qos.logback.classic.Logger;

public class UserDefinedException extends Exception {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	public 	UserDefinedException(String exception){
		
		super(exception);
	}
}

/**
 * 
 */
package com.student.helper.auth.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Nayeemul
 *
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class MissingHeaderInfoException extends RuntimeException
{
	private static final long serialVersionUID = 1L;

	public MissingHeaderInfoException(String message) {
        super(message);
    }
}

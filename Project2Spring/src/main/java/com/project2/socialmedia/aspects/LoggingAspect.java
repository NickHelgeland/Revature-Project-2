package com.project2.socialmedia.aspects;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
/**
 * This is a class aspect. 
 * @author Nick, Ilia, Danny and Fausto.
 *
 */
@Component("logging")
@Aspect
public class LoggingAspect 
{
	final static Logger logger = LogManager.getLogger(LoggingAspect.class);
	
	@After("execution(public com.project2.socialmedia.response.Result login(*,*))")
	public void logLogin()
	{
		logger.info("A user has logged in.");
	}
}

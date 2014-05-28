package it.insiel.farmaweb.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerTracker{

	private static final Logger logger = LoggerFactory.getLogger(LoggerTracker.class);
	
	@Before("execution(String it.insiel.farmaweb.controllers.HomeController.home(..))")
	public void logIt(JoinPoint joinPoint){
		logger.info("sono passato per qui: {}",joinPoint.getSignature().getName());
	}
	
}

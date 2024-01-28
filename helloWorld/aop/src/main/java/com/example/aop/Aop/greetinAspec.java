package com.example.aop.Aop;


import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class greetinAspec {
    
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Before("execution( String  com.example.aop.services.GreetingService.sayHello(..) )")
    public void loggerBefore( JoinPoint joinPoint ){
        
        String method = joinPoint.getSignature().getName();
        String args   = Arrays.toString( joinPoint.getArgs() ) ; 

        logger.info(" before : "  + method + " arguments  : " + args ); 
    }
}

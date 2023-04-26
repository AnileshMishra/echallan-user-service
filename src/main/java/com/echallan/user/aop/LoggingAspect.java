package com.echallan.user.aop;

/*
 * import org.aspectj.lang.JoinPoint; import
 * org.aspectj.lang.annotation.AfterReturning; import
 * org.aspectj.lang.annotation.AfterThrowing; import
 * org.aspectj.lang.annotation.Aspect; import
 * org.aspectj.lang.annotation.Before; import org.slf4j.Logger; import
 * org.slf4j.LoggerFactory; import org.springframework.stereotype.Component;
 * 
 * @Aspect
 * 
 * @Component public class LoggingAspect {
 * 
 * private static final Logger LOGGER =
 * LoggerFactory.getLogger(LoggingAspect.class);
 * 
 * @Before("execution(* com.example.myapp.service.*.*(..))") public void
 * logMethodCall(JoinPoint joinPoint) { LOGGER.info("Calling method: {}",
 * joinPoint.getSignature().getName()); }
 * 
 * @AfterReturning(pointcut = "execution(* com.example.myapp.service.*.*(..))",
 * returning = "result") public void logMethodResult(JoinPoint joinPoint, Object
 * result) { LOGGER.info("Method {} returned: {}",
 * joinPoint.getSignature().getName(), result); }
 * 
 * @AfterThrowing(pointcut = "execution(* com.example.myapp.service.*.*(..))",
 * throwing = "exception") public void logMethodException(JoinPoint joinPoint,
 * Exception exception) { LOGGER.error("Method {} threw exception: {}",
 * joinPoint.getSignature().getName(), exception.getMessage()); } }
 */
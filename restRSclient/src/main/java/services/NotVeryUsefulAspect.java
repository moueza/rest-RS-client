package services;

//package org.xyz;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**pointcut, advice, and introduction (inter-type) declarations.
 * https://docs.spring.io/spring/docs/2.5.x/reference/aop.html
 *  auto-proxying.*/
@Aspect
public class NotVeryUsefulAspect {
	
	@Pointcut("execution(* transfer(..))")// the pointcut expression
	private void anyOldTransfer() {}// the pointcut signature

}

/**https://docs.spring.io/spring/docs/2.5.x/reference/aop.html
 * 6.2.3. Declaring a pointcut
 * pointcuts determine join points */
 
 
 
 
 
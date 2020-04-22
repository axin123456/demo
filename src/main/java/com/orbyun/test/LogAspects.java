package com.orbyun.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;

@Aspect
public class LogAspects {
    @Pointcut("execution(public int com.orbyun.test..*(..))")
    private void pointCut() {
    }


    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println(""+joinPoint.getSignature().getName()+"运行。。。@Before:参数列表是：{"+ Arrays.asList(args)+"}");
    }

    @AfterReturning(returning = "rvt",value = "pointCut()")
    public void logAfter(JoinPoint joinPoint,Object rvt) {
        System.out.println(""+joinPoint.getSignature().getName()+"运行结果是:"+rvt);
    }

}

package com.aloneness.spring.study.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect
public class LogAspects {

    /**
     * 切点，目标方法
     */
    @Pointcut("execution(public int com.aloneness.spring.study.aop.Calculator.*(..))")
    public void pointCut() {
    }

    /**
     * 前置通知
     *
     * @param joinPoint
     */
    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(joinPoint.getSignature().getName() + " 除法运行... 参数列表是..." + Arrays.asList(args));
    }

    /**
     * 后置通知
     *
     * @param joinPoint
     */
    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName() + " 除法结束... ");
    }

    /**
     * 返回通知
     *
     * @param result
     */
    @AfterReturning(value = "pointCut()", returning = "result")
    public void logReturn(Object result){
        System.out.println("除法正常返回..." + result);
    }

    /**
     * 异常通知
     *
     * @param exception
     */
    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void logException(Exception exception){
        System.out.println("除法异常..." + exception);
    }

    /**
     * 环绕通知
     *
     * @param joinPoint
     * @return
     */
    @Around("pointCut()")
    public Object logAround(ProceedingJoinPoint joinPoint){
        Object result = null;
        try{
            // 得到方法执行所需的参数
            Object[] args = joinPoint.getArgs();

            System.out.println("LogAspects类中的logAround方法开始记录日志了...前置" +
                    joinPoint.getSignature().getName() + "-->" + Arrays.asList(args));

            // 明确调用业务层方法（切入点方法）
            result = joinPoint.proceed(args);

            System.out.println("LogAspects类中的logAround方法开始记录日志了...后置" +
                    joinPoint.getSignature().getName() + "-->" + Arrays.asList(args));

            return result;
        }catch (Throwable t){
            System.out.println("LogAspects类中的logAround方法开始记录日志了...异常");
            throw new RuntimeException(t);
        }
    }
}

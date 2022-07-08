package demo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* demo.ShoppingCart.checkout(..))")  // .. -> Da igual el número de parametros a recibir
    public void beforeLogger(JoinPoint jp) {
        System.out.println("Before Loggers: " + jp.getSignature());
        System.out.println("Before Loggers with argument: " + jp.getArgs()[0]);
    }

    @After("execution(* *.*.checkout(..))")     // .. -> Da igual el número de parametros a recibir
    public void afterLogger() {
        System.out.println("After Loggers");
    }

    @Pointcut("execution(* demo.ShoppingCart.quantity(..))")
    public void afterReturningPointCut() {
    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal) {
        System.out.println("After Returning " + retVal);
    }


}

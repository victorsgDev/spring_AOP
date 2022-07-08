package demo.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* demo.ShoppingCart.checkout(..))")  // .. -> Da igual el número de parametros a recibir
    public void beforeLogger(){
        System.out.println("Before Loggers");
    }

    @After("execution(* *.*.checkout(..))")     // .. -> Da igual el número de parametros a recibir
    public void afterLogger(){
        System.out.println("After Loggers");
    }


}

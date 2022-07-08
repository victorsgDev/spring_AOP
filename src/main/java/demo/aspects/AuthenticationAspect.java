package demo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AuthenticationAspect {

    @Pointcut("within(demo..*)")
    public void authenticatingPointCut() {
    }

    @Pointcut("within(demo..*)")
    public void authorizationPointCut() {
    }

    @Before("authenticatingPointCut()&& authorizationPointCut())")
    public void authenticate() {
        System.out.println("Authenticating the request");
    }

}

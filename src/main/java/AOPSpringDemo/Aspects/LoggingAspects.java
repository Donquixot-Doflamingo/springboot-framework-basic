package AOPSpringDemo.Aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspects {
    //(..) is used if there are any number of arguments in the method it will make it up for that to match
    @Before("execution(* AOPSpringDemo.baseClasses.ShoppingKart.checkOut(..))")
    public void beforeLogger(JoinPoint jp){
        String Arguments = jp.getArgs()[0].toString();
        System.out.println("Before Logger with argument " + Arguments);
    }
    @After("execution(* *.*.*.checkOut(..))")
    public void afterLogger(){
        System.out.println("After Logger");
    }

    @Pointcut("execution(* *.*.*.quantity(..))")
    public void afterRetuningPointCut(){
    }

    @AfterReturning(pointcut = "afterRetuningPointCut()", returning = "retVal")
    public void afterRetuning(int retVal){
        System.out.println("After Retuning the value is : " + retVal);
    }
}

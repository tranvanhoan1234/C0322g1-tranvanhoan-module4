package com.example.borrow_books.aspect;
import com.example.borrow_books.service.ITrafficService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BookAspect {
    @Autowired
    private ITrafficService trafficService;

    @AfterReturning(pointcut = " execution(public * com.example.borrow_books.controller.BookController.*(..)) ")
    public void logHistory(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println("The " + name + " method just worked");
    }

    @After(" execution(public * com.example.borrow_books.controller.BookController.goHome(..)), && args(showDetail(..)) ")
    public void increaseTraffic(JoinPoint joinPoint) {
        trafficService.increase();
    }


}
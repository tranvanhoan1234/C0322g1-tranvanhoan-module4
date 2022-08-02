package com.example.borrow_books.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Aspect
public class BookAspect {
    int count=0;
    @Pointcut("execution(* com.example.borrow_books.controller.BookController.borrowBook(..))")
    public void userBorrowPointCut() {
    }

    @AfterReturning("userBorrowPointCut()")
    public void userBorrowLog() {
        System.err.println("1 người dùng mượn sách thành công, lúc " + LocalDateTime.now());
    }

    @Pointcut("execution(* com.example.borrow_books.controller.BookController.returnBook())..))")
    public void payBookPointCut() {
    }

    @AfterReturning("payBookPointCut()")
    public void payBookLog() {
        System.err.println("1 người dùng trả sách thành công, lúc " + LocalDateTime.now());
    }

    @Pointcut("within(com.example.borrow_books.controller.*)")
    public void allMethodPointCut() {
    }

    @After("allMethodPointCut()")
    public void writeAllAction() {
        count++;
        System.out.println("Tu lúc: " + LocalDateTime.now() + ", tất cả: " + count + " thao tác vào thư viện");
    }



}
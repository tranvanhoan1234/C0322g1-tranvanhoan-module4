package com.example.borrow_books.aspect;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class ExceptionBool {
    public class ExceptionHandle {
        @ExceptionHandler(Exception.class)
        private String showErrorPage() {
            return "error";
        }
    }
}

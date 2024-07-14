package com.moon.designpattern.cor;

import org.springframework.stereotype.Component;

@Component
public class RequestValidator implements Handler{
    @Override
    public void handle(ExecutionContext context) {
        System.out.println(context.getMsg() + " request validator");
    }

    @Override
    public boolean canHandle(ExecutionContext context) {
        return true;
    }
}

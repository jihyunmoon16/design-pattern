package com.moon.designpattern.cor;

import org.springframework.stereotype.Component;

@Component
public class PersistData implements Handler{
    @Override
    public void handle(ExecutionContext context) {
        System.out.println(context.getMsg() + " persistData");
    }

    @Override
    public boolean canHandle(ExecutionContext context) {
        return true;
    }
}

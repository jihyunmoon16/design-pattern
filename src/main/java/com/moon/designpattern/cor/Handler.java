package com.moon.designpattern.cor;

public interface Handler {
    void handle(ExecutionContext context);
    boolean canHandle(ExecutionContext context);
}

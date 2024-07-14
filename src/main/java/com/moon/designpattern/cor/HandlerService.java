package com.moon.designpattern.cor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HandlerService {
    private final List<Handler> handlers;

    @Autowired
    public HandlerService(List<Handler> handlers) {
        this.handlers = handlers;
    }

    public void process(ExecutionContext context) {
        for (Handler handler : handlers) {
            if (handler.canHandle(context)) {
                handler.handle(context);
                break;
            }
        }
    }
}


package com.moon.designpattern.cor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HandlerService {
    private final Strategy handlers;

    @Autowired
    public HandlerService(Strategy handlers) {
        this.handlers = handlers;
    }

    public void process(ExecutionContext context) {
        for (Handler handler : handlers.getHandlers()) {
            handler.handle(context);
        }
    }
}


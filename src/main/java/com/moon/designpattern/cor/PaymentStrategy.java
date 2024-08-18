package com.moon.designpattern.cor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class PaymentStrategy implements Strategy {
    @Autowired
    private RequestValidator requestValidator;

    @Autowired
    private PersistData persistData;

    @Autowired
    private PerformingMoneyMovement performingMoneyMovement;

    public List<Handler> getHandlers() {
        return Collections.unmodifiableList(Arrays.asList(requestValidator, persistData, performingMoneyMovement)
        );
    }
}

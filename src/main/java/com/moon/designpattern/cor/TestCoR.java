package com.moon.designpattern.cor;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestCoR {
    public static void main(String[] args) {
        String paymentDate = "2024-07-21";

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        String todayDate = dateFormat.format(new Date());

        boolean isPaymentToday = paymentDate.equals(todayDate);

        Strategy strategy;
        if(isPaymentToday) {
            strategy = new PaymentStrategy();
        } else {
            strategy = new ScheduledStrategy();
        }

        HandlerService handlerService = new HandlerService(strategy);


    }
}

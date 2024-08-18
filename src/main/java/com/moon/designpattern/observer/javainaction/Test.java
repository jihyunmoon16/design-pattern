package com.moon.designpattern.observer.javainaction;

public class Test {
    public static void main(String[] args) {
        Feed f = new Feed();
//        f.registerObserver(new NYTimes());
//        f.registerObserver(new Guardian());
        f.registerObserver(new LeMonde());


        /**
         * using lambda
         */
        f.registerObserver((String tweet) -> {
            if(tweet != null && tweet.contains("money")) {
                System.out.println("Breaking news in NY! " + tweet);
            }
        });

        f.registerObserver((String tweet) -> {
            if(tweet != null && tweet.contains("queen")) {
                System.out.println("Yet more news from London... " + tweet);
            }
        });


        f.notifyObservers("The queen said her favorite book is Modern Java in Action!");
    }
}

package com.moon.designpattern.cor.javainaction;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Test {
    public static void main(String[] args) {
        ProcessingObject<String> p1 = new HeaderTextProcessing();
        ProcessingObject<String> p2 = new SpellCheckerProcessing();

//        p1.setSuccessor(p2);
//        String result = p1.handle("Aren't labdas really useful?!!");
//        System.out.println(result);


        /**
         * using lambda
         */
        UnaryOperator<String> headerProcessing = (String text) -> "From Raoul, Mario and Aln: " + text;
        UnaryOperator<String> spellCheckerProcessing = (String text) -> text.replace("labda", "lambda");

        Function<String, String> pipeline = headerProcessing.andThen(spellCheckerProcessing);
        String result = pipeline.apply("Aren't labdas really useful?!!");
        System.out.println(result);
    }
}

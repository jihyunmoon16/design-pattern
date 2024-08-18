package com.moon.designpattern.cor.javainaction;

public class SpellCheckerProcessing extends ProcessingObject<String>{
    @Override
    protected String handleWork(String text) {
        return text.replace("labda", "lambda");
    }
}

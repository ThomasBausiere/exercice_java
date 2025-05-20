package org.example.structural.decorator;

public class PrefixDecorator extends TextDecorator{
    public PrefixDecorator(Text text) {
        super(text);
    }

    @Override
    public String transform(String text) {
        return "[PREFIX]"+text;
    }
}

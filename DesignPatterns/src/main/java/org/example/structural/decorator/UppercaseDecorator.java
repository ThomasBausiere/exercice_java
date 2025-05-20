package org.example.structural.decorator;

public class UppercaseDecorator extends TextDecorator{
    public UppercaseDecorator(Text text) {
        super(text);
    }

    @Override
    public String transform(String text) {
        return text.toUpperCase();
    }
}

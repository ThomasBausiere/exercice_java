package org.example.structural.decorator;

public class LowerCaseDecorator extends TextDecorator{

    public LowerCaseDecorator(Text text) {
        super(text);
    }

    @Override
    public String transform(String text) {
        return text.toLowerCase();
    }
}

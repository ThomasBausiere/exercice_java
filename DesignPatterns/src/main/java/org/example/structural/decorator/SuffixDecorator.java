package org.example.structural.decorator;

public class SuffixDecorator extends TextDecorator{

    public SuffixDecorator(Text text) {
        super(text);
    }

    @Override
    public String transform(String text) {
        return text+"[Suffix]";
    }
}

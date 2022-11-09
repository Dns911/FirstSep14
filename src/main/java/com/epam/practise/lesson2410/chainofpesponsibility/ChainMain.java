package com.epam.practise.lesson2410.chainofpesponsibility;

import com.epam.composite.UnitComposite;

public class ChainMain {
    public static void main(String[] args) {
        TextParser textParser = new TextParser();
        SentenseParser sentenseParser = new SentenseParser();
        LexemaParser lexemaParser = new LexemaParser();
        textParser.setSuccessor(sentenseParser);
        sentenseParser.setSuccessor(lexemaParser);

        UnitComposite textComposite = textParser.parse("txt");
    }
}

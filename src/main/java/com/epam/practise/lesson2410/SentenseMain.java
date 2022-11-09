package com.epam.practise.lesson2410;

import java.util.ArrayList;
import java.util.List;

public class SentenseMain {
    public static void main(String[] args) {
        String senetence = """
                This chapter defines standarts.
                Of naming conv. And customized extension.
                """;
    }
}

class AlphaParser {
    static final String SENTENCE_REGEX = "";
    static final String LEXEMA_REGEX = "";
    static final String SYMBOL_REGEX = "";

    List<String> parseText(String text) {
        List<String> result = new ArrayList<>();
        //loop
        return result;
    }

    List<String> parseSentence(String text) {
        List<String> result = new ArrayList<>();
        //
        return result;
    }

    List<Character> parseLexema(String text) {
        List<Character> result = new ArrayList<>();
        //
        return result;
    }
}
class BetaParser {
    static final String SENTENCE_REGEX = "";
    static final String WORD_REGEX = "";
    static final String SYMBOL_REGEX = "";

    List<Character> parseText(String text) {
        List<Character> result = new ArrayList<>();
        //loop
        // call parseSentence
        return result;
    }

    List<String> parseSentence(String text) {
        List<String> result = new ArrayList<>();
        //
        //call parseLexema
        return result;
    }

    List<Character> parseLexema(String text) {
        List<Character> result = new ArrayList<>();
        //
        return result;
    }
}

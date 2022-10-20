package com.epam.practise.lesson1910;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        Locale locale = new Locale("be", "BY");
        Locale locale1 = new Locale("ru", "RU");
        Locale locale2 = new Locale("", "");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("prop.text", locale2);
        System.out.println(resourceBundle.getString("str1"));
    }
}

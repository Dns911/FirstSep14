package com.epam.first.fistdemo;

import java.io.Console;
import java.util.Scanner;

public class FirstDemo {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.printf("String 2 = %2$s + %1$s", str1, str2);
    }
}

package com.epam.practise.regexpractise;

import java.security.MessageDigest;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LeftMain {
    public static void main(String[] args) {
//        String xssString = "<script>alert('hello')</script>";
        String xssString = "    alerer  tre place";
        //xssString = xssString.replace('<',' ').replace('>',' ');
        // xssString = xssString.replaceAll("</?script>","");
//        boolean b = xssString.matches("<script>alert('hello')</script>");
//        String[] b = xssString.split("\\t");
//        System.out.println(xssString);
//        System.out.println(Arrays.toString(b));
//        Pattern pattern = Pattern.compile("\\t");
//        Matcher matcher = pattern.matcher(xssString);
////        System.out.println(matcher.lookingAt());
////        System.out.println(matcher.find(7));
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }

//        int c = 10;
//        while (c>0){
//            Instant instant = Instant.now();
//            LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
//            System.out.println(localDateTime);
//            c--;
//        }

        double d = 2.0 / 3;
        System.out.println(d);
        System.out.printf("%5.2f%n", d);
        Formatter formatter = new Formatter();
        formatter = formatter.format("%5.2f", d);
        System.out.println(formatter);

        Double dd = d;
        System.out.println(dd.hashCode());
        String enc = "Pass_1";



    }
}

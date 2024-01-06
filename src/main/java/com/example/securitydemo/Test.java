package com.example.securitydemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
//        String str = "09/05/2023|15:37|Tài khoản: 025840580001|Số tiền GD:-212,121 VND|";
//        String pattern = "\\|Tài khoản: (\\d+)\\|";
//        Pattern compiledPattern = Pattern.compile(pattern);
//        Matcher matcher = compiledPattern.matcher(str);
//
//        if (matcher.find()) {
//            System.out.println(matcher.group(1));
//        }

        String input = "Hello, my name is John Doe. I am 82 years old.";

        Pattern pattern = Pattern.compile("name is ([A-Za-z ]+)\\. I am ([0-9]+) years old\\.");

        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            String str = matcher.group(0);
            String fullName = matcher.group(1);
            String age = matcher.group(2);

            System.out.println("FULL: " + str);
            System.out.println("Full Name: " + fullName);
            System.out.println("Age: " + age);
        }
    }
}

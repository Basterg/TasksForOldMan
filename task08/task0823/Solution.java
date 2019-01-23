package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        firstLetersToUpperCase(string);
    }

    public static void firstLetersToUpperCase(String string) {
        char[] charsOfString = string.toCharArray();
        System.out.print(Character.toString(charsOfString[0]).toUpperCase());
        for (int i = 1; i < charsOfString.length; i++) {
            String leftElement = Character.toString(charsOfString[i - 1]);
            String element = Character.toString(charsOfString[i]);
            if (leftElement.equals(" ") && !element.equals(" ")) {
                element = element.toUpperCase();
            }
            System.out.print(element);
        }
    }
}

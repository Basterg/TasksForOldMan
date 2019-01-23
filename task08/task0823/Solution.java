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
        firstLettersToUpperCase(string);
    }

    public static void firstLettersToUpperCase(String string) {
        char[] charsOfString = string.toCharArray();
        System.out.print(Character.toUpperCase(charsOfString[0]));
        for (int i = 1; i < charsOfString.length; i++) {
            if (Character.isWhitespace(charsOfString[i - 1])
                    && Character.isAlphabetic(charsOfString[i])) {
                System.out.print(Character.toUpperCase(charsOfString[i]));
            } else {
                System.out.print(charsOfString[i]);
            }
        }
    }
}

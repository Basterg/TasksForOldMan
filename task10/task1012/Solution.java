package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // Ввод строк
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        String newString = "";
        for (int i =0; i < list.size(); i++) {
            newString += list.get(i);
        }

        char[] charsOfString = newString.toCharArray();
        for (int j = 0; j < alphabet.size(); j++) {
            int count = 0;
            Character currentLetter = alphabet.get(j);
            for (int k = 0; k < charsOfString.length; k++) {
                Character currentChar = charsOfString[k];
                if (currentLetter.equals(currentChar)) {
                    count += 1;
                }
            }
            System.out.println(currentLetter + " " + count);
        }
    }

}

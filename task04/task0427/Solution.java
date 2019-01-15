package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String s = bufferedReader.readLine();
        int i = Integer.parseInt(s);
        printNumberInfo(i);
    }
    public static void printNumberInfo(int a) {
        if (a < 1000 && a > 0) {
            System.out.println(parity(a) + " " + numberOfChars(a) + " " + "число");
        }
    }
    public static String parity(int a){
        boolean isEven = a % 2 == 0;
        String parityString = isEven ? "четное" : "нечетное";
        return parityString;
    }
    public static String numberOfChars(int a){
        if (a < 10) {
            return "однозначное";
        } else if (a < 100) {
            return "двузначное";
        } else {
            return "трехзначное";
        }
    }
}

package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String s = bufferedReader.readLine();
        int i = Integer.parseInt(s);
        System.out.println(positiveOrNot(i) + oddOrEven(i));
    }
    public static String positiveOrNot(int a) {
        if (a > 0) {
            return "положительное ";
        } else if (a == 0) {
            return "ноль";
        } else {
            return "отрицательное ";
        }
    }
    public static String oddOrEven(int a) {
        if (a % 2 == 0 && a != 0) {
            return "чётное число";
        } else if (a != 0) {
            return "нечётное число";
        } else {
            return "";
        }
    }
}
package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int numberOfChars = s.length();
        int i = Integer.parseInt(s);
        lala(i, numberOfChars);
        System.out.println("Even: " + even + " " + "Odd: " + odd);
    }
    public static void lala(int a, int b) {
        for (; a > 0; b--) {
            int firstNumeeral = a/(int)Math.pow(10, (b - 1) );
            lol(firstNumeeral);
            a -= firstNumeeral * (int)Math.pow(10, (b - 1));
        }
    }
    public static void lol(int a) {
        if (a % 2 == 0) {
            even++;
        } else {
            odd++;
        }
    }
}

package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        bufferedReader.readLine();
        String ageStr = bufferedReader.readLine();
        int age = Integer.parseInt(ageStr);
        if (age > 20) {
            System.out.println("И 18-ти достаточно");
        }
    }
}
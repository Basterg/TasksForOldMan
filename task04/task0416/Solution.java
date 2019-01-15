package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream =  System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s = bufferedReader.readLine();
        double t = Double.parseDouble(s);
        if (t % 5 < 3) {
            System.out.println("зелёный");
        } else if (t % 5 < 4) {
            System.out.println("жёлтый");
        } else {
            System.out.println("красный");
        }
    }
}
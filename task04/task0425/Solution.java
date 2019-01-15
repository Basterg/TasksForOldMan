package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String s1 = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        System.out.println(belongingToTheQuarterCoordinate(a, b));
    }
    public static int belongingToTheQuarterCoordinate(int a, int b) {
        if (a > 0 && b > 0) {
            return 1;
        } else if (a < 0 && b > 0) {
            return 2;
        } else if(a < 0 && b <0) {
            return 3;
        } else {
            return 4;
        }
    }
}

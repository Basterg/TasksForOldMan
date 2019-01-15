package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int n = Integer.parseInt(s);
        int maximum = 0;
        for (int i = n; i > 0; i--) {
            String s1 = reader.readLine();
            int a = Integer.parseInt(s1);
            if (a > maximum) {
                maximum = a;
            }
        }
        System.out.println(maximum);
    }
}

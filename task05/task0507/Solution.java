package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static int count = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {
            String s1 = bufferedReader.readLine();
            int i = Integer.parseInt(s1);
            if (i == -1) {
                break;
            } else {
                sum += i;
                count++;
            }
        }
        System.out.println(average(sum));
    }
    public static double average(int a) {
        return (double)a/count;
    }
}


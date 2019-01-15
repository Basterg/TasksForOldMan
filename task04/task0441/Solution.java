package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();
        String s3 = bufferedReader.readLine();
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        int i3 = Integer.parseInt(s3);
        System.out.println(average(i1, i2 ,i3));
    }
    public static int average(int a, int b, int c) {
        if (a == b || a == c) {
            return a;
        } else if (b == c) {
            return b;
        } else if ((b > a && a > c) || (c > a && a > b)) {
            return a;
        } else if ((a > b && b > c) || (c > b && b > a)) {
            return b;
        } else {
            return c;
        }
    }
}

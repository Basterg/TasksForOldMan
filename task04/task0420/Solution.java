package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String s1 = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();
        String s3 = bufferedReader.readLine();
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        int i3 = Integer.parseInt(s3);
        int buffer;
        if (i3 > i2) {
            buffer = i2; i2 = i3;
        } else if (i2 > i1) {
            i1 = i3;
        }
    }
}

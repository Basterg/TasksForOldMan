package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String ageStr = bufferedReader.readLine();
        int age = Integer.parseInt(ageStr);
        if (age < 18) {
            System.out.println("Подрасти ещё");
        }
    }
}

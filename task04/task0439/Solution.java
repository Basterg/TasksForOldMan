package com.javarush.task.task04.task0439;

/* 
Письмо счастья
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String name = bufferedReader.readLine();
        for (int i = 10; i > 0; i--){
            System.out.println(name + " " + "любит меня.");
        }
    }
}

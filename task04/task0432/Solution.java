package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String string = bufferedReader.readLine();
        String stringN = bufferedReader.readLine();
        int n = Integer.parseInt(stringN);
        linesOutput(n, string);
    }
    public static void linesOutput(int a, String s){
        while (a > 0) {
            System.out.println(s);
            a -= 1;
        }
    }
}

package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        readData();
    }

    public static void readData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; true; i++) {
            String string = reader.readLine();
            try {
                int number = Integer.parseInt(string);
                list.add(number);
            } catch (NumberFormatException e) {
                for (int currentNumber : list) {
                    System.out.println(currentNumber);
                }
            }
        }
    }
}

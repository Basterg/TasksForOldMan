package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    public static void divideByZero() {
        System.out.println(47 / 0);
    }

}

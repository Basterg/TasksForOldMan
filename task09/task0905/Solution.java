package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();
    }

    public static int getStackTraceDeep() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int deepCount = 0;
        for (StackTraceElement element : stackTraceElements) {
            deepCount++;
        }
        System.out.println(deepCount);

        return deepCount;
    }
}


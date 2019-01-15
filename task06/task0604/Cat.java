package com.javarush.task.task06.task0604;

/* 
Ставим котов на счётчик
*/

public class Cat {
    public static int catCount = 0;

    public Cat() {
        catCount++;
    }

    public static void main(String[] args) {
        for (int i = 50000000; i > 0; i--) {
            Cat cat = new Cat();
        }
    }
    protected void finalize() throws Throwable {
        catCount--;
    }
}
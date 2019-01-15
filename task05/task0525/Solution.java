package com.javarush.task.task05.task0525;

/* 
И целой утки мало
*/

public class Solution {

    public static void main(String[] args) {
        Duck duck1 = new Duck(2);
        Duck duck2 = new Duck(3);
        System.out.println(duck1);
        System.out.println(duck2);
        Duck duck3 = new Duck(6);
        System.out.println(duck3);

        //напишите тут ваш код
    }

    public static class Duck {
        public String toString() {
            return "Ducklll";
        }
        int age;
        public Duck(int age) {
            this.age = age;
        }
        public int aha() {
            return 5;
        }
        public String lola() {
            return "kaka";
        }
    }

    //напишите тут ваш код
}

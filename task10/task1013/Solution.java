package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private int weight;
        private int height;
        private String marriedStatus;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this(name);
            this.age = age;
        }

        public Human(String name, int age, boolean sex) {
            this(name, age);
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex, int weight) {
            this(name, age, sex);
            this.weight = weight;
        }

        public Human(String name, int age, boolean sex, int weight, int height) {
            this (name, age, sex, weight);
            this.height = height;
        }

        public Human(String name, int age, boolean sex, int weight,
                     int height, String marriedStatus) {
            this(name, age, sex, weight, height);
            this.marriedStatus = marriedStatus;
        }

        public Human(String name, boolean sex, int height, int weight) {
            this(name);
            this.sex = sex;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, boolean sex) {
            this(name);
            this.sex = sex;
        }

        public Human(boolean sex, int weight, int height, int age) {
            this.sex = sex;
            this.weight = weight;
            this.height = height;
            this.age = age;
        }

        public Human(String name, String marriedStatus) {
            this(name);
            this.marriedStatus = marriedStatus;
        }
    }
}

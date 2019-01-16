package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human grandpaF = new Human("ded", true, 60);
        System.out.println(grandpaF);
        Human grandpaM = new Human("Dedok", true, 65);
        System.out.println(grandpaM);
        Human grandmaF = new Human("olda", false, 50);
        System.out.println(grandmaF);
        Human grandmaM = new Human("Bab", false, 55);
        System.out.println(grandmaF);
        Human father = new Human("batya", true, 40, grandpaF, grandmaF);
        System.out.println(father);
        Human mother = new Human("mamka", false, 35, grandpaM, grandmaM);
        System.out.println(mother);
        Human kid1 = new Human("down", false, 15, mother, father);
        System.out.println(kid1);
        Human kid2 = new Human("dcp", false, 16, mother, father);
        System.out.println(kid2);
        Human kid3 = new Human("genius", true, 17, mother, father);
        System.out.println(kid3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.age = age;
            this.sex = sex;
            this.name = name;
        }

        public Human(String name, boolean sex, int age, Human mother, Human father) {
            this.age = age;
            this.sex = sex;
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

    public static void initializeAndPrintArray(ArrayList<Human> family) {
        for (int i = 0; i < 9; i++) {

        }
    }
}
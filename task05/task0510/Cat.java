package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name = null;
    private int age = 1;
    private int weight = 1;
    private String color = "Хуйня";
    private String adress = null;
    public void initialize(String name) {
        this.name = name;
    }
    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void initialize(int age, String color) {
        this.age = age;
        this.color = color;
    }
    public void initialize(int weight, String color, String adress) {
        this.weight = weight;
        this.color = color;
        this.adress = adress;
    }

    public static void main(String[] args) {

    }
}

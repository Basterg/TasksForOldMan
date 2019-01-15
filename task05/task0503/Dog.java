package com.javarush.task.task05.task0503;


/* 
Геттеры и сеттеры для класса Dog
*/

public class Dog {
    String name;
    int age;
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(13);
        System.out.println(dog.getAge());
        dog.setAge(10);
        System.out.println(dog.getAge());
        dog.getAge();
        System.out.println(dog.getAge());
    }
}

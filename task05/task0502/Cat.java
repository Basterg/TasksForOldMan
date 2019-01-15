package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }
    public boolean fight(Cat anotherCat) {
        if (this.age + this.weight + this.strength > anotherCat.age + anotherCat.weight + anotherCat.strength) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Cat cat1 = new Cat();
            cat1.age = 2;
            cat1.weight = 4;
            cat1.strength = 2;
        Cat cat2 = new Cat();
            cat2.age = 3;
            cat2.weight = 5;
            cat2.strength = 1;
        cat1.fight(cat2);
    }
}

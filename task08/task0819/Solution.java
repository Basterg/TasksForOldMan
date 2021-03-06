package com.javarush.task.task08.task0819;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        removeOneElement(cats);
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        Cat cat1 = new Cat();
        cats.add(cat1);
        Cat cat2 = new Cat();
        cats.add(cat2);
        Cat cat3 = new Cat();
        cats.add(cat3);

        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    public static class Cat {

    }

    public static void removeOneElement(Set<Cat> cats) {
        Iterator<Cat> iterator = cats.iterator();
        if (iterator.hasNext()) {
            cats.remove(iterator.next());
        }
    }
}

package com.javarush.task.task06.task0605;


import java.io.*;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(reader.readLine());
        double height = Double.parseDouble(reader.readLine());
        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            double i = weight/(height * height);
            if (i < 18.5) {
                System.out.println("Недовес: меньше чем 18.5");
            } else if (i < 24.9) {
                System.out.println("Нормальный: между 18.5 и 24.9");
            } else if (i < 29.9) {
                System.out.println("Избыточный вес: между 25 и 29.9");
            } else {
                System.out.println("Ожирение: 30 или больше");
            }
        }
    }
}

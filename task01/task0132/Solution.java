package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
       int sotni = number/100;
       int des9t = (number - sotni * 100)/10;
       int edini = number - (sotni * 100) - (des9t * 10);

            return sotni + des9t + edini;
    }
}
package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> words) {
        HashMap<String, Integer> result = new HashMap();
        /* Заполняем мапу словами, затем переводим ключи мапы в список,
        таки образом, у нас есть список слов без их копий
         */

        for (int i = 0; i < words.size(); i++) {
            result.put(words.get(i), 0);
        }

        ArrayList<String> listOfKeys = new ArrayList<>(result.keySet());
        for (int i = 0; i < listOfKeys.size(); i++) {
            int count = 1;
            String currentWord = listOfKeys.get(i);
            for (int j = 0; j < words.size(); j++) {
                if (currentWord.equals(words.get(j))) {
                    count++;
                }
            }
            result.put(currentWord, count);
        }
        return result;
    }

}


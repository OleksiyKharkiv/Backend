package Alg_Lesson_14_12_2022;

import java.util.HashMap;
import java.util.Map;
public class HashDoublicate {

        public static main(String[] args) {

            int[] arr = { 1, 2, 3, 1, 4, 5 };
            int[] arr2 = { 1, 2, 3, 4, 5 };


            //TODO:
            // Напишите метод, который получает на вход массив, в котором все элоементы уникальные, кроме одного
            // и возвращает элемент, который повторяется ровно 2 раза
            // Таких элементов будет гарантировано 1, либо 0
            // Если элемент не найден, вернуть -1

            Map<Integer, Integer> map = new HashMap<>();
            for (int i: arr) {
                if (map.putIfAbsent(i,i) != null)
                    return arr[i];
                }
                
            }
        }



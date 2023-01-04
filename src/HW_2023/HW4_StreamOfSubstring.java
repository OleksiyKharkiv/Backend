package HW_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.toList;

public class HW4_StreamOfSubstring {

    //    public static List<String> main(String[] substrings) {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter substrings:");
        String str = sc.nextLine();
        if (str == null || str.length() == 0) {
            System.out.println("Empty string");
        } else {
            String[] substrings = str.split(" ");
            System.out.print(Arrays.toString(substrings) + " ");
            System.out.println();
            List<String>list = new ArrayList<>(List.of(substrings));
            int longest = list.stream()
                    .mapToInt(String::length)
                    .max()
                    .orElse(-1);

            List<String> result = list.stream()
                    .filter(s -> s.length() == longest)
                    .collect(toList());
            System.out.println(Arrays.toString(result.toArray()));

//            public static List<String> getLongestSubstring (String[] args){
//            List<String> list = new ArrayList<>();
//            list = (List<String>) Stream.of(str.split(" "))
//                    .map(s -> (Substring)s)
//                    .sorted();
//            Stream<String> bigestSubstring = Stream.of(str.split(" "))
//                    .sorted()
//                    .filter()
//                    .count();
//                return Arrays
//                        .stream(substrings)
//                        .distinct()
//                        .sorted((s1, s2) -> s2.length() - s1.length())
//                        .reduce(substrings[0], (res, el) -> {
//                            if (substrings[0].equals("")) {
//                                substrings[0] = el;
//                                res = el;
//                            } else if (el.length() == substrings[0].length()) {
//                                res = res + ", " + el;
//                            }
//                            return res;
//                        });
//                    .collect(Collectors.toList());

//                    .collect(Collectors.toMap(x -> x, x -> 1, Integer::sum));
//                    .max(String::compareTo).get().lines();
//                    .sorted((s1, s2) -> s2.length() - s1.length())
//                    .count(substrings.length());
//                    .get(substrings.length);
//                    .peek(p -> p.substring(substrings.length))
//                    .max(String::compareTo).get()};
            }
        }
    }

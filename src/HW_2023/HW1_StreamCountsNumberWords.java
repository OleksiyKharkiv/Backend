package HW_2023;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class HW1_StreamCountsNumberWords {
    public static void main(String[] args) {
        wordCountInLines();
    }

    public static String inputString() {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = input.nextLine();
        System.out.println("Control input String: " + str);
        return str;
    }

    public static void splitIntoSubstrings() {
        String str = inputString();
        System.out.println("the string is split into substrings:");
        String[] words = str.split(" ");
        //        checking the split of a string into individual words
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void wordCountInLines() {
        String str = inputString();
        System.out.println("the string is split into substrings:");
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        List<String> wordsList = Stream.of(words).toList();
        wordsList.stream()
                .sorted()
                .map(String::toLowerCase)
                .distinct()
                .filter(wordsList::equals).count();
        for (String subStr : wordsList) {
            System.out.println(subStr);
        }

//                .collect(Collectors.toList());
//        for (String subStr : distinct) {
//            System.out.println(subStr);
//        Arrays.stream(words)
//                .filter(words::equals).count();
//
//        System.out.println(Arrays.toString(words));
//        List<String> distinct = Arrays.asList(words).stream().map(String::toLowerCase).sorted().distinct().collect(Collectors.toList());
//        for (String subStr : distinct) {
//            System.out.println(subStr);
    }

}
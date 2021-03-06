package me.shihab.streamsexercise.map_filter;

import java.util.List;
import java.util.stream.Collectors;

public class MapExample {


    public static List<String> alphabet =
            List.of("alfa", "bravo", "charlie", "delta", "echo",
                    "foxtrot", "golf", "hotel", "india", "juliet",
                    "kilo", "lima", "mike", "november", "oscar",
                    "papa", "quebec", "romeo", "sierra", "tango",
                    "uniform", "victor", "whiskey", "x-ray", "yankee",
                    "zulu");


    // This helper method transform a string to a list of character
    public static List<String> expand(String str) {
        return str
                .chars()
                .mapToObj(Character::toString)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {


        System.out.println("Prints the number of word with char length 6");
        alphabet.stream()
                .filter(s -> s.length() == 6)
                .forEach(System.out::println);

        System.out.println("Prints the number of word with char length 6 and don't start with a letter q");
        alphabet.stream()
                .filter(s -> (s.length() == 6 && !String.valueOf(s.charAt(0)).equals("q")))
                        .forEach(System.out::println);

        System.out.println("Prints the number of character in each word");
        alphabet.stream()
                .map(String::length)
                .forEach(System.out::println);

        System.out.println("Prints the first character of each word");
        alphabet.stream()
                .map(word -> word.charAt(0))
                .forEach(System.out::println);

        System.out.println("Prints all characters of all the words with a newline");
        alphabet.stream()
                .flatMap(word -> expand(word).stream())
                .collect(Collectors.toList()).forEach(System.out::println);

    }


}

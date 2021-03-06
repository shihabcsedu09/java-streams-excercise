package me.shihab.streamsexercise.flatmap;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class FlatMap {

    public static List<String> alphabet =
            List.of("alfa", "bravo", "charlie", "delta", "echo",
                    "foxtrot", "golf", "hotel", "india", "juliet",
                    "kilo", "lima", "mike", "november", "oscar",
                    "papa", "quebec", "romeo", "sierra", "tango",
                    "uniform", "victor", "whiskey", "x-ray", "yankee",
                    "zulu");


    private static List<String> sonnet = List.of(
            "From fairest creatures we desire increase,",
            "That thereby beauty's rose might never die,",
            "But as the riper should by time decease,",
            "His tender heir might bear his memory:",
            "But thou contracted to thine own bright eyes,",
            "Feed'st thy light's flame with self-substantial fuel,",
            "Making a famine where abundance lies,",
            "Thy self thy foe, to thy sweet self too cruel:",
            "Thou that art now the world's fresh ornament,",
            "And only herald to the gaudy spring,",
            "Within thine own bud buriest thy content,",
            "And, tender churl, mak'st waste in niggarding:",
            "Pity the world, or else this glutton be,",
            "To eat the world's due, by the grave and thee.");

    public static void main(String[] args) {

        //Split each line of the sonnet into words and make a list of those words
        List<String> words = sonnet.stream()
                .flatMap(lines -> Arrays.stream(lines.split(" +").))
                .collect(toList());

        System.out.println(words);

    }
}

package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {
        //подсчет символов по условию
        String str = "AbaCadaEafa";
        System.out.println("В строке встретилось " + str.chars()
                .filter(ch->ch == 'a')
                .count() + " символов а");
        List<String> collected = Stream.of("a", "b", "hello")
                .map(string -> string.toUpperCase())
                .collect(toList());
        collected.stream().forEachOrdered(x-> System.out.println(x));

        Random r = new Random();

        r.doubles(10L).map(x->x*100).forEachOrdered(x-> System.out.println(x));

        List<Double> doubleList = new ArrayList<>();
        r.doubles(10L).map(x->x*100).filter(x->x < 20.0).forEach(x->doubleList.add(x));

        System.out.println("Выводим лист");
        doubleList.stream().forEachOrdered(x-> System.out.println(x));

    }
}
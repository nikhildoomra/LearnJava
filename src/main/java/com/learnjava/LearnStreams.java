package com.learnjava;
import java.util.ArrayList;
import java.util.Arrays;

class LearnStreams {
    public static void main(String[] args) {
        // create streams
        System.out.println("Stream from collection: ");
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Nikhil", "Kriti"));
        names.stream().map(s -> s.toUpperCase()).forEach(System.out::println);

        // create stream from array
        System.out.println("Stream from array: ");
        String[] arr = {"Nikhil", "Kriti"};
        Arrays.stream(arr).map(s -> s.toUpperCase()).sorted().forEach(System.out::println);

        // stream operations
        System.out.println("Stream operations: ");
        names.stream().filter(s -> s.startsWith("N")).map(s -> s.toUpperCase()).forEach(System.out::println);
        
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(numbers).filter(n -> n % 2 == 0).sum();
        System.out.println("Sum of even numbers: " + sum);

        
    }
    
}
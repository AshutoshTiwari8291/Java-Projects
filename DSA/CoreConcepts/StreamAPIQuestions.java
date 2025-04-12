package CoreConcepts;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAPIQuestions {

    public static void AltimeticQuestion() {
        //        write a program for the given list using java 8 features ,
        //                1) fetch all the numbers greater than 4,
        //                2) add 1 to each digit
        //        3) sort the list of integers in descending order  and
        //        4) get the count of duplicate numbers all using stream API.
        //        {1,4,6,2,2,7,3,7,4,8,6}

        List<Integer> numbers = Arrays.asList(1, 4, 6, 2, 2, 7, 3, 7, 4, 8, 6);

        // Step 1: Fetch numbers greater than 4
        List<Integer> filteredNumbers = numbers.stream()
                .filter(num -> num > 4) // Keep numbers greater than 4
                .collect(Collectors.toList());

        // Step 2: Add 1 to each number
        List<Integer> incrementedNumbers = filteredNumbers.stream()
                .map(num -> num + 1) // Add 1 to each number
                .collect(Collectors.toList());

        // Step 3: Sort in descending order
        List<Integer> sortedNumbers = incrementedNumbers.stream()
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .collect(Collectors.toList());

        // Step 4: Count duplicate numbers
        Map<Integer, Long> duplicateCount = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print results
        System.out.println("Numbers greater than 4: " + filteredNumbers);
        System.out.println("After adding 1 to each: " + incrementedNumbers);
        System.out.println("Sorted in descending order: " + sortedNumbers);
        System.out.println("Duplicate count: " + duplicateCount);



    }

    public static void main(String[] args) {
        AltimeticQuestion();
    }
}

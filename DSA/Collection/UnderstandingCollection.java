package Collection;

import java.util.*;
import java.util.stream.Collectors;

public class UnderstandingCollection {

    public static void main(String[] args) {
       List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,1,9,9,9,9,9,9,9,9,9,9);
       Set<Integer> seen = new HashSet<Integer>();

       String input = "swiss";

       System.out.println(numbers);

       List<Integer> bigger = numbers.stream().map(val -> val*2).collect(Collectors.toList());

        System.out.println(bigger);

        List<Integer> evenNumber = numbers.stream().filter(n -> n%2==0).collect(Collectors.toList());

        System.out.println(evenNumber);

        Set<Integer> duplicates = numbers.stream().filter(n -> !seen.add(n)).collect(Collectors.toSet());
        System.out.println(duplicates);

    }


}

package _02_02.before;

import java.util.*;

public class GenericMethods {

    public static void main(String[] args) {
        Double[] doubles = {2.0, 3.5, 14.7};
        Integer[] numbers = {1, 5, 7};

        List<Double > wordList = convertToArrayList(doubles);
        List<Integer> numberList = convertToArrayList(numbers);

        System.out.println(wordList);
        System.out.println(numberList);
    }

    public static <T extends Number> List<T> convertToArrayList(T[] array) {
        return Arrays.asList(array);
    }

}

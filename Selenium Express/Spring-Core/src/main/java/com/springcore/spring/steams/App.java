package com.springcore.spring.steams;

import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        System.out.print("Hello");

//        StreamUtil.wordStream()
//                .map(word -> word.toUpperCase())
//                .forEach(word -> System.out.println(word));
//
//        ReactiveStreamUtil.wordReactiveStream()
//                .map(word -> word.toUpperCase())
//                .subscribe(word -> System.out.println(word));


        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .peek(no -> System.out.print("\nA"+no))
                .limit(4)
                .peek(no -> System.out.print("B"+no)).
                forEach(word -> System.out.print("C"+word));
    }
}

package com.starter.mvc;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamsAPI {

    public static void main(String[] args) {

        // This is the real code to accept and generate the streams in java below we will write the smaller version.
        //        Supplier<String> supplier= new Supplier<String>() {
        //            @Override
        //            public String get() {
        //                return "Hello World";
        //            }
        //        };
        //
        //        Consumer<String> consumer = new Consumer<String>() {
        //            @Override
        //            public void accept(String s) {
        //                System.out.println(s);
        //            }
        //        };
        //        Stream.generate(supplier).forEach(consumer);


        // This is the quick code
        //        Stream.generate(()-> "Hello World").forEach((value)-> System.out.println(value));

        Stream.of(1,2,3,4,5,6,7,8,9,10).forEach((stream) -> System.out.println(stream));







    }
}

package com.springcore.spring.steams;

import java.util.stream.Stream;

public class StreamUtil {
    public static Stream<String> wordStream() {
        return Stream.of("Hello", "This is", "something");
    }
}

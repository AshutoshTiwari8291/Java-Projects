package com.starter.mvc;

import java.util.stream.Stream;

public class StreamUtil {

    public static Stream<String> wordStream() {
        return Stream.of("hello", "world", "Learning");
    }
}

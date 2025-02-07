package com.starter.mvc;

import java.util.stream.Stream;

public class StreamUtil {

    Stream<String> wordStream() {
        return Stream.of("hello", "world", "Learning");
    }
}

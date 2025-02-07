package com.springcore.spring.steams;

import reactor.core.publisher.Flux;

public class ReactiveStreamUtil {

    public static Flux<String> wordReactiveStream() {
        return Flux.just("Fun", "in", "learning", "java");
    }
}

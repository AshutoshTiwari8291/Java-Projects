package com.starter.mvc;

public class App 
{
    public static void main( String[] args )
    {
        StreamUtil.wordStream().forEach(word -> System.out.println(word));
    }
}

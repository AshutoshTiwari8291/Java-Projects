package com.starter.mvc;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamWithCollection {
    public static void main(String[] args) {

        Student ashutosh = new Student(1, "Ashutosh Tiwari", 941325829, 22);
        Student bshutosh = new Student(1, "bshutosh Tiwari", 941325829, 23);
        Student cshutosh = new Student(1, "cshutosh Tiwari", 941325829, 22);
        Student dshutosh = new Student(1, "dshutosh Tiwari", 941325829, 26);
        Student eshutosh = new Student(1, "eshutosh Tiwari", 941325829, 26);
        Student fshutosh = new Student(1, "fshutosh Tiwari", 941325829, 26);
        Student gshutosh = new Student(1, "gshutosh Tiwari", 941325829, 32);
        Student hshutosh = new Student(1, "hshutosh Tiwari", 941325829, 28);

        List<Student> studentList = Arrays.asList(ashutosh, bshutosh, cshutosh, dshutosh,eshutosh,fshutosh,gshutosh,hshutosh);

        Stream<Student> streamOfStudents = studentList.stream();


        // old way of printing
        //        for (Student s: studentList) {
        //            System.out.println(s);
        //        }

        // new way of printing
        //        stream.forEach((detail) -> System.out.println(detail));


        Integer[] number = {1,2,3,4,5,6,7,8,9,10,11,13,12};

        Stream<Integer> streamofNumners = Arrays.stream(number);

        // Predicate is a functional interface having test function.
        //        Stream<Integer> streamInteger1 = streamofNumners.filter(new Predicate<Integer>() {
        //            @Override
        //            public boolean test(Integer integer) {
        //                return integer > 5;
        //            }
        //        });

        //        streamofNumners
        //                .peek(num -> System.out.println("Processing: "+ num))
        //                .filter(data -> data > 1)
        //                .map(num -> {
        //                    switch (num) {
        //                        case 1: return "One";
        //                        case 2: return "Two";
        //                        case 3: return "Three";
        //                        default: return "Greater than 3";
        //                    }
        //                })
        //                .count();
                        //.collect(Collectors.toList());
                        // .forEach(data -> System.out.println("After filter: " + data));

         // Print all the students
        List<String> Oldstudents = streamOfStudents
                .filter(f -> f.getAge() > 22)
                .map(Student::getStudentName)
                .limit(2)
                .collect(Collectors.toList());

        //        System.out.println(Oldstudents);

        // Sorted is a stateful intermidiate operation
        Stream.of("Test", "Ashutosh", "Btosh", "qtosh", "Aashutosh")
                .filter(nameStr -> {
                    System.out.println("Filter:  "+ nameStr);
                    return nameStr.length() > 4;
                })
                .sorted()
                 .peek(name -> System.out.println("Sorting done: "+ name))
                .forEach(d -> System.out.println(d));

    }

}

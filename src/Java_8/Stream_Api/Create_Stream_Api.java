package Java_8.Stream_Api;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Create_Stream_Api {
    public static void main(String[] args) {
        List<Integer> list = List.of(12, 34, 56, 7, 8, 9, 2, 1, 3, 4);

//           1. Collection Object

//        Stream<Integer> stream = list.stream();
//        stream.forEach((e) -> {
//            System.out.print(e + " ");
//        });


//        Set<Integer> set = new HashSet<>(list);
//        Stream<Integer> set1 = set.stream();
//        System.out.println();


//        2 Using Empty Method
//        Stream<Integer> s = Stream.empty();
//        s.forEach(e -> {
//            System.out.println(e);
//        });


//      -->   Example of Filter Method

//        Stream<String> stream2 = Stream.of(new String[]{"Ganesh", "Mohit", "Rohit", "Ganesh Kushwah"});
//        stream2.forEach(e -> {
//            System.out.println(e);
//        });

//        List<String> list1 = stream2.filter(e -> e.length() <= 6).collect(Collectors.toList());
//        System.out.println(list1);


////      3. Using Build Method
//        Stream<Double> stream3 = Stream.<Double>builder().build();
//
//        LinkedHashSet<Integer> ans1 = new LinkedHashSet<>(Arrays.asList(12, 34, 5, 6, 123, 12, 1, 12, 34, 56, 78, 12, 34, 9, 5, 6, 3));
//        Stream<Integer> ans = ans1.stream();
//        ans.forEach(e -> {
//            System.out.print(e + " ");
//        });

    }
}

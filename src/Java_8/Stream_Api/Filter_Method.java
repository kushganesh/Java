package Java_8.Stream_Api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter_Method {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(56);
        arrayList.add(45);
        arrayList.add(123);
        arrayList.add(90);
        arrayList.add(78);
        System.out.println(arrayList);

        Stream<Integer> stream = arrayList.stream();
//        stream.forEach(e -> {
//            System.out.print(e + " ");
//        });

        System.out.println(stream.filter(e -> e % 2 == 0).collect(Collectors.toList()));

        Stream<Integer> stream2 = arrayList.stream();
        System.out.println(stream2.filter(e -> e % 2 == 1).collect(Collectors.toList()));
        arrayList.stream().filter(e -> e > 15).forEach(System.out::println);
    }
}

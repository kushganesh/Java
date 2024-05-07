package Java_8.Stream_Api;

import java.util.List;

public class Map_Method {
    public static void main(String[] args) {

        List<Integer> ans = List.of(1, 2, 3, 4, 5, 6, 7, 1, 3, 4, 6, 7, 3, 4, 5, 7, 45);
        ans.stream().map(e -> e * 6).forEach(e -> System.out.print(e + " "));
        System.out.println();
        ans.stream().map(e -> e * 3).forEach(e -> System.out.print(e + " "));
        System.out.println();

        ans.stream().sorted((a, b) -> {
            if (a < b)
                return 1;
            else
                return -1;
        }).forEach(e -> System.out.print(e + " "));


        System.out.println();
        int a1 = ans.stream().max((a, b) -> a.compareTo(b)).get();
        int b1 = ans.stream().min((a, b) -> a.compareTo(b)).get();
        System.out.println(a1+" "+b1);


    }
}

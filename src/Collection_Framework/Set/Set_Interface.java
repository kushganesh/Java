package Collection_Framework.Set;

import java.util.*;

public class Set_Interface {
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();
//        set.add(12);
//        set.add(34);
//        set.add(45);
//        set.add(87);
//        System.out.println(set);
//
//        set.addAll(new ArrayList<>(Arrays.asList(12, 34, 56, 67, 13, 12, 13, 34, 465, 67)));
//        System.out.println(set);
//        System.out.println(set.size());
//        Object arr[] = set.toArray();
//        System.out.println(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        //       Iterator iterator = set.iterator();

//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }


        Set<Integer> set1 = new HashSet<>(Arrays.asList(12, 34, 56, 78, 90, 23, 13, 46));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(12, 34, 90, 13, 46, 23));
        System.out.println(set1);
        System.out.println(set2);

//        union
//        set1.addAll(set2);
//        System.out.println(set1);

//        intersection
//        set1.retainAll(set2);
//        System.out.println(set1);

        // difference
        set2.removeAll(set1);
        System.out.println(set2);

    }
}

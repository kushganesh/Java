package Collection_Framework.Set;

import java.util.Comparator;
import java.util.TreeSet;

public class Sort_String_Using_TreeSet {
    public static void main(String[] args) {

//        TreeSet<String> treeSet = new TreeSet<>((a, b) -> {
//            if (a.compareTo(b) > 0) {
//                return -1;
//            } else if (a.compareTo(b) < -1) {
//                return 1;
//            } else {
//                return 0;
//            }
//        });
//        treeSet.add("Ganesh");
//        treeSet.add("Bhopal");
//        treeSet.add("Mohit");
//        treeSet.add("Gopal");
//        System.out.println(treeSet);


        TreeSet<String> treeSet1= new TreeSet<>(new Sorting());
        treeSet1.add("Mohit");

        treeSet1.add("Ganesh");
        treeSet1.add("Jyapal");
        treeSet1.add("Mohini");
        treeSet1.add("Rakesh");
        treeSet1.add("Jaymohni");
        System.out.println(treeSet1);

    }
}

class Sorting implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;

        if (s1.compareTo(s2) > 0) {
            return -1;
        } else if (s1.compareTo(s2) < 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
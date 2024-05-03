package Collection_Framework.Set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHashSet_In_Set {
    public static void main(String[] args) {

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < 10; i++) {
            linkedHashSet.add(i);
        }
        linkedHashSet.add(34);
        linkedHashSet.add(56);
        for (int i = 10; i >= 0; i--) {
            linkedHashSet.add(i+91);
        }
        linkedHashSet.add(89);
        System.out.println(linkedHashSet);



    }
}




package Collection_Framework.Set;

import java.util.HashSet;

public class HashSet_In_Set {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            hashSet.add(i);
        }
        for (int i = 10; i >= 0; i--) {
            hashSet.add(i);
        }
        System.out.println(hashSet);
        System.out.println(hashSet.contains(10));
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet.remove(10));
        System.out.println(hashSet.size());
        hashSet.clear();
        System.out.println(hashSet);
    }
}

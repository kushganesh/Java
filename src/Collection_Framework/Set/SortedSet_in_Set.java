package Collection_Framework.Set;

import java.util.Comparator;
import java.util.TreeSet;

public class SortedSet_in_Set {
    public static void main(String[] args) {
  Comparator<Integer> comparator = (a,b)->{
      if(a<b)
          return  1;
      else
          return -1;
  };
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(12);
        treeSet.add(345);
        treeSet.add(567);
        treeSet.add(3412);
        treeSet.add(456);
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.headSet(107));
        System.out.println(treeSet.tailSet(567));
        System.out.println(treeSet.headSet(567));
        System.out.println(treeSet.subSet(345, 567));


        TreeSet<Integer> treeSet1 = new TreeSet<>(comparator);
        treeSet1.add(12);
        treeSet1.add(34);
        treeSet1.add(1);
        System.out.println(treeSet1);

    }
}

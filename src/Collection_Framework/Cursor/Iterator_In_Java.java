package Collection_Framework.Cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_In_Java {
    public static void main(String[] args) {
        // universal , one-directional , read and remove both
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            arrayList.add(i);
        }

        Iterator<Integer> iterator = arrayList.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        while (iterator.hasNext()) {
            int intger = iterator.next();
            if (intger % 2 == 0) {
                System.out.println(intger);
            } else {
                iterator.remove();
            }
        }


    }
}
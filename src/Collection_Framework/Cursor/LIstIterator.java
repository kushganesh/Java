package Collection_Framework.Cursor;

import java.util.ArrayList;
import java.util.ListIterator;

public class LIstIterator {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);

        ListIterator<Integer> listIterator = arrayList.listIterator();
//        while (listIterator.hasNext()) {
//            System.out.println(listIterator.next());
//        }

        while (listIterator.hasNext()) {
            int integer = listIterator.next();
            if (integer % 2 == 0) {
                listIterator.remove();

            }
            else{
                listIterator.set(3456);
                listIterator.add(12345678);
            }
        }
        System.out.println(arrayList);
    }
}

package Collection_Framework.Cursor;

import java.util.Enumeration;
import java.util.Vector;

public class Enumaration_in_Java {
    public static void main(String[] args) {
        // only  for legacy classes
        Vector<Integer> vector = new Vector<>();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }

        System.out.println(vector);

        Enumeration<Integer> enumaration = vector.elements();
        while (enumaration.hasMoreElements()) {
            System.out.println(enumaration.nextElement());
        }

    }
}

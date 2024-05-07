package Java_8.Functional_Interface_And_Lamda_Exp;

import java.util.Random;

interface display {
    void random_password();
}

public class Lamda_Exp_as_Arg {
    public static void main(String[] args) {

        display1(() -> {
            for (int i = 0; i < 100; i++) {
                int random = new Random().nextInt(100);
                System.out.println(random);
            }

            System.out.println();
        });
    }

    public static void display1(display dis) {
        dis.random_password();
    }

}

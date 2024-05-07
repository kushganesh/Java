package Java_8.Functional_Interface_And_Lamda_Exp;

interface AddItion {
    void add(int a, int b);
}

interface Multiplication {
    void multiplication(int a, int b);
}

interface Subtraction {
    void subtraction(int a, int b);
}

interface Division {
    void division(int a, int b);
}

public class lamda_2 {
    public static void main(String[] args) {
        AddItion add = (a, b) -> System.out.println(a + b);
        Multiplication mul = (a, b) -> System.out.println(a + b);
        Division div = (a, b) -> System.out.println(a / b);
        Subtraction sub = (a, b) -> System.out.println(a - b);

        add.add(12,34);
        mul.multiplication(12,45);
        div.division(34,7);
        sub.subtraction(78,56);
    }
}

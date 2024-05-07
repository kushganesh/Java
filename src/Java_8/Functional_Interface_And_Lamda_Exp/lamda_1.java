package Java_8.Functional_Interface_And_Lamda_Exp;

@FunctionalInterface
interface Addition {
    int add(int a, int b);

    static void dk() {
        System.out.println(100);
    }

    default void display() {
        System.out.println("Ganesh is playing with chase");
    }

}

public class lamda_1 {
    public static void main(String[] args) {
        Addition add = (a, b) -> a + b;
        System.out.println(add.add(12, 34));


        Addition ad1 = new Addition() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
            public  void  display(){
                System.out.println("This is Ganesh, Creation of my life ");
            }
        };
        System.out.println(ad1.add(12, 456));
        ad1.display();
    }
}

package Java_8.Methode_ref;

@FunctionalInterface
interface A1 {
    void display();
}

public class Static_methode_ref {
    public static void main(String[] args) {
        A1 a = Show_class::CricketPlaying;

        Show_class s = new Show_class();

        A1 a1 = s::play;

        a.display();
        a1.display();
        Runnable r1=Show_class::thread;
        Thread s1= new Thread(r1);
        s1.start();
    }
}

package Java_8.Methode_ref;

public class Show_class {
    public void play() {
        System.out.println("I am Playing with u bro");
    }

    public static void CricketPlaying() {
        System.out.println("I am playing Cricket");
    }

    public static int thread() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1001);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        return 0;
    }

}

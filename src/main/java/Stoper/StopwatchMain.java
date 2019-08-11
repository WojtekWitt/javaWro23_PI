package Stoper;

public class StopwatchMain {
    public static void main(String[] args) {
        long x;
        Stopwatch st = new Stopwatch();
        x = st.stop();

        System.out.println("Czas: " + x);

    }
}

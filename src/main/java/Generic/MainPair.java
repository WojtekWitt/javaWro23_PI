package Generic;

public class MainPair {
    public static void main(String[] args) {
     //   Pair<Integer, String> pair = new Pair(2, "dwa");
        Pair<String, String > pair2 = new Pair<String, String>(Integer.toString(2),Integer.toString(1));
        String string2 = pair2.getKey();
    }
}

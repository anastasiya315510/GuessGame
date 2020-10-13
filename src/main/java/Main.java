import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static String str;

    static ArrayList<Double> list = new ArrayList<>();
    public static void main(String[] args) {
        do {
            JoptionPlane jp = new JoptionPlane();
            int max = jp.showInputDialog();
            GuessGame g = new GuessGame();
            g.play(max);
            list.add(g.score);
            str = jp.continueGame();
        }while ( !str.equalsIgnoreCase("STOP"));
        System.out.println("Best score " + Collections.max(list));

    }


}

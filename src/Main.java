import Eighth.B3;
import Eighth.B5;
import Eighth.B9;
import Seventh.B10;
import Seventh.B2;
import Seventh.B7;
import Seventh.B8;

/**
 * Created by TangChen on 17/11/28.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("B2 answer is " + B2.main());
        B7.dfs(0);
        System.out.println("B7 answer is " + B7.count);
        System.out.print("B8 answer is "); B8.solution(773535);
        System.out.print("B10 answer is "); B10.input();
        System.out.println("------------------------------");
        System.out.print("B2 answer is ");Eighth.B2.solve();
        System.out.print("B3 answer is ");B3.main();
        System.out.print("B5 answer is ");B5.main();
        System.out.print("B7 answer is ");Eighth.B7.main();
        System.out.print("B9 answer is " + B9.main());
        System.out.println();
        Eighth.B10.main();

    }
}
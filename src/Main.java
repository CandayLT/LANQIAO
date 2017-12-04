import Seventh.B2;
import Seventh.B7;
import Seventh.B8;

/**
 * Created by TangChen on 17/11/28.
 */
public class Main {
    public static void main(String[] args) {
        B7.dfs(0);
        System.out.println("B7 answer is " + B7.count);
        System.out.println("B2 answer is " + B2.main());
        System.out.println("B8 answer is ");
        B8.solution(773535);
    }
}
package Eighth;

/**
 * Created by TangChen on 17/12/5.
 */
public class B2 {
    static int[] a = new int[9];
    static boolean[] isVisit = new boolean[9];
    static int count = 0;

    public static void solve() {
        dfs(0);
        System.out.println(count / 6);
    }

    public static void dfs (int n) {
        if (n == 9) {
            if (jud()) {
                count++;
            }
            return;
        }

        for (int i = 0; i < 9; i++) {
            if(!isVisit[i]) {
                isVisit[i] = true;
                a[n] = i;
                dfs(n + 1);
                isVisit[i] = false;
            }
        }
    }

    private static boolean jud() {
        int ax = a[0] + a[1] + a[3] + a[5];
        int bx = a[5] + a[6] + a[7] + a[8];
        int cx = a[0] + a[2] + a[4] + a[8];

        return ax == bx && ax == cx;

    }
}
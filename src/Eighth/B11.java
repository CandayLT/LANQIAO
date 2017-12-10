package Eighth;

//很久以前，T王国空前繁荣。为了更好地管理国家，王国修建了大量的快速路，用于连接首都和王国内的各大城市。
//        为节省经费，T国的大臣们经过思考，制定了一套优秀的修建方案，使得任何一个大城市都能从首都直接或者通过其他大城市间接到达。
// 同时，如果不重复经过大城市，从首都到达每个大城市的方案都是唯一的。
//        J是T国重要大臣，他巡查于各大城市之间，体察民情。所以，从一个城市马不停蹄地到另一个城市成了J最常做的事情。
// 他有一个钱袋，用于存放往来城市间的路费。
//        聪明的J发现，如果不在某个城市停下来修整，在连续行进过程中，他所花的路费与他已走过的距离有关，
// 在走第x千米到第x+1千米这一千米中（x是整数），他花费的路费是x+10这么多。也就是说走1千米花费11，走2千米要花费23。
//        J大臣想知道：他从某一个城市出发，中间不休息，到达另一个城市，所有可能花费的路费中最多是多少呢？

/**
 * Created by TangChen on 17/12/10.
 */
public class B11 {
    static boolean[] isVisit;
    static int[][] input;
    static int max = 0;
    static int N = 5;

    public static void main() {
        input = new int[N + 1][N + 1];
        input[1][2] = input[2][1] = 2;
        input[1][3] = input[3][1] = 1;
        input[2][4] = input[4][2] = 5;
        input[2][5] = input[5][2] = 4;

        for(int i = 1; i < N + 1; i++) {
            isVisit = new boolean[N+1];
            dfs(0, i);
        }
        System.out.println("最远路径：" + (max * 10 + max * (1 + max) / 2));

    }

    static void dfs(int s, int n) {
        if(!isVisit[n]) {
            isVisit[n] = true;

            max = s > max ? s : max;

            for (int i = 1; i < input[n].length; i++) {
                if (input[n][i] != 0) {
                    dfs(s + input[n][i], i);
                }
            }
        }
    }
}
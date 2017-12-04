package Seventh;

//四平方和
//
//        四平方和定理，又称为拉格朗日定理：
//        每个正整数都可以表示为至多4个正整数的平方和。
//        如果把0包括进去，就正好可以表示为4个数的平方和。
//
//        比如：
//        5 = 0^2 + 0^2 + 1^2 + 2^2
//        7 = 1^2 + 1^2 + 1^2 + 2^2
//        （^符号表示乘方的意思）
//
//        对于一个给定的正整数，可能存在多种平方和的表示法。
//        要求你对4个数排序：
//        0 <= a <= b <= c <= d
//        并对所有的可能表示法按 a,b,c,d 为联合主键升序排列，最后输出第一个表示法
/**
 * Created by TangChen on 17/12/4.
 */
public class B8 {
    public static void solution(int n) {
        int prime = n;
        n = (int) Math.sqrt(n);

        for (int s1 = 0; s1 <= n; s1++)
            for (int s2 = s1; s2 <= n; s2++)
                for (int s3 = s2; s3 <= n; s3++)
                    for (int s4 = s3; s4 <= n; s4++)
                        if (s1 * s1 + s2 * s2 + s3 * s3 + s4 * s4 == prime) {
                            System.out.println(s1 + ", " + s2 + ", " + s3 + ", " + s4);
                            return;
                        }
    }
}

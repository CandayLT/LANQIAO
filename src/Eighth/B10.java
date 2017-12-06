package Eighth;

/**
 * Created by TangChen on 17/12/6.
 */
public class B10 {
    public static void main() {
        int K = 2;
        int[] ints = {1, 2, 3, 4, 5};
        int count = 0;
        int n = ints.length, total = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (j == 0)
                    total = ints[j];
                else
                    for (int start = i; start <= j; start++)
                        total += ints[start];

                if(total % K == 0)
                    count++;

            }
        }
        System.out.println("B10 answer is :" + count);
    }
}
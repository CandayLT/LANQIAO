package Seventh;

//剪邮票
//
//        如【图1.jpg】, 有12张连在一起的12生肖的邮票。
//        现在你要从中剪下5张来，要求必须是连着的。
//        （仅仅连接一个角不算相连）
//        比如，【图2.jpg】，【图3.jpg】中，粉红色所示部分就是合格的剪取。
//
//        请你计算，一共有多少种不同的剪取方法。
//
//        请填写表示方案数目的整数。
//        注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。

public class B7 {
    public static int count = 0;
    static boolean[] isVisit = new boolean[13];
    static int[] outputArray = new int[5];

    public static void dfs(int n) {
        if (n == 5) { //通过DFS获得五个数的全排列
            if (judge()) {
                count++;
            }
            return;
        }

        for (int i = 1; i <= 12; i++) {
            if (!isVisit[i]) {
                isVisit[i] = true;
                outputArray[n] = i;
                dfs(n + 1);
                isVisit[i] = false;
            }
        }
    }

    private static boolean judge() {
        int n = outputArray.length, outsideCount = 0;
        int previousX, nextX, previousY, nextY, insideCount;
        for (int i = 0; i < n; i++) {
            insideCount = 0;
            for (int j = 0; j < n; j++) {
                if (j > i && outputArray[j] < outputArray[i])
                    //由于五个数的全排列可能存在多种不同的序列代表同样的意义，因此只取一种递增序列
                    return false;

                previousX = (outputArray[i] - 1) / 4;
                previousY = (outputArray[i] - 1) % 4;
                nextX = (outputArray[j] - 1) / 4;
                nextY = (outputArray[j] - 1) % 4;

                if ((previousX == nextX && Math.abs(previousY - nextY) == 1)
                        || (previousY == nextY && Math.abs(previousX - nextX) == 1)) {
                    insideCount++;
                    outsideCount++;
                }
            }

            if (insideCount == 0)
                return false;
        }

        //如果五个元素相邻，至少有8个相邻点
        return outsideCount >= 8;
    }
}
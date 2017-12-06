package Eighth;

//小明正在整理一批历史文献。这些历史文献中出现了很多日期。小明知道这些日期都在1960年1月1日至2059年12月31日。
// 令小明头疼的是，这些日期采用的格式非常不统一，有采用年/月/日的，有采用月/日/年的，还有采用日/月/年的。更加麻烦的是，年份也都省略了前两位，
// 使得文献上的一个日期，存在很多可能的日期与其对应。
//
//        比如02/03/04，可能是2002年03月04日、2004年02月03日或2004年03月02日。
//
//        给出一个文献上的日期，你能帮助小明判断有哪些可能的日期对其对应吗？


/**
 * Created by TangChen on 17/12/6.
 */
public class B7 {
    public static void main() {
        String date = "99/03/04";
        String[] d = date.split("/");
        judge1(new String[]{d[0], d[1], d[2]});
        judge1(new String[]{d[2], d[1], d[0]});
        judge1(new String[]{d[2], d[0], d[1]});
    }

    public static void judge1(String[] d) {
        int[] data = new int[d.length];
        String tmp = "";

        for (int i = 0; i < d.length; i++)
            data[i] = Integer.valueOf(d[i]);

        if (data[0] >= 60)
            tmp += "19" + data[0];
        else {
            if (data[0] < 10)
                tmp += "200" + data[0];
            else
                tmp += "20" + data[0];
        }

        if (data[1] > 12)
            return;

        if (data[1] != 2) {
            if (isThirtyDay(data[1])) {
                if (data[2] > 30)
                    return;
            }
            else {
                if (data[2] > 31)
                    return;
            }
        } else {
            if (isR(Integer.valueOf(tmp))) {
                if (data[2] > 28)
                    return;
            } else {
                if (data[2] > 29)
                    return;
            }
        }

        tmp += "-" + (data[1] < 10 ? "0" + data[1] : data[1]) + "-" + (data[2] < 10 ? "0" + data[2] : data[2]);
        System.out.println(tmp);
    }

    public static boolean isThirtyDay(int month) {
        return month == 4 || month == 6 || month == 9 || month == 11;
    }

    public static boolean isR(int year) {
        return year % 4 == 0;
    }
}
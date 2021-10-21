import java.sql.SQLOutput;

public class Sequence0ton {


    public int Sequence(int end) {
        int sum = 0;
        final int start = 1;

//rost +
        if (end >= 1) {
            for (int i = 1; i <= end; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        } else {
            if (end < 1) {
                for (int i = 1; i <= end; i++) {
                    sum = sum - i;
                }
                System.out.println(sum);
            }
        }
        return sum;
    }
}
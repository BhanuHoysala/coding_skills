import java.util.ArrayList;

/**
 * Program to run K iterations over a list
 */

public class CircularListIteration {

    public static ArrayList<String> daysList = new ArrayList<String>() {{
        add("mon");
        add("tue");
        add("wed");
        add("thu");
        add("fri");
        add("sat");
        add("sun");
    }};

    public static void main(String[] args) {

        String day = Solution.solution("mon", 21);

        System.out.println("days is " + day);
    }
}


class Solution {

    static public String solution(String S, final int K) {

        int j = 0;
        int i = CircularListIteration.daysList.indexOf(S);
        while (j < K) {

            i++;
            if (i == CircularListIteration.daysList.size()) {
                i = 0;
            }
            j++;

        }

        return CircularListIteration.daysList.get(i);

    }
}

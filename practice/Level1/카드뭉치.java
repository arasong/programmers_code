package Level1;

public class 카드뭉치 {

    public static void main(String[] args) {
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println(solution(cards1, cards2, goal));
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int idx_1 = 0;
        int idx_2 = 0;

        for (int i = 0; i < goal.length; i++) {
            if (idx_1 < cards1.length && goal[i].equals(cards1[idx_1])) {
                idx_1++;
            } else if (idx_2 < cards2.length && goal[i].equals(cards2[idx_2])) {
                idx_2++;
            } else {
                answer = "No";
                break;
            }
        }
        if (answer.length() == 0) {
            answer = "Yes";
        }
        return answer;
    }

}

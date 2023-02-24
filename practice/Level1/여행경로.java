package Level1;

import java.util.ArrayList;

public class 여행경로 {
    public static boolean[][] visited;
    public static ArrayList<String> result = new ArrayList<>();

    public static void main(String[] args) {
        solution(new String[][]{{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}});
    }

    public static String[] solution(String[][] tickets) {
        String[] answer = new String[tickets[0].length];
        visited = new boolean[tickets[0].length][2];

        for (int y = 0; y < tickets[0].length; y++) {
            for (int x = 0; x < 2; x++) {
                //출발지가 인천인 경우에 BFS
                if (tickets[y][0] == "ICN") {
                    result.add("ICN");
                    DFS(tickets, tickets[y][1], 0);
                }
            }
        }


        return answer;
    }

    public static void DFS(String[][] tickets, String start, int level) {
        result.add(start);
        // 종료 조건
        if (level == tickets[0].length) {
            result.toArray(new String[tickets[0].length]);
            return;
        }

        for (int i = 0; i < tickets[0].length; i++) {
            if (start == tickets[i][0]) {
                DFS(tickets, tickets[i][1], level + 1);
            }
        }
        return;
    }
}

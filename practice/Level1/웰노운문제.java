package Level1;

import java.util.*;

public class 웰노운문제 {
    public static void main(String[] args) {
        //      String[] answer = solution(new String[]{"kate sqrt"});
        String[] answer = solution(new String[]{"morgan sort", "felix sort", "morgan sqrt", "morgan sqrt", "rohan reverse", "rohan reverse"});
        //String[] answer = solution(new String[]{"morgan string_compare", "felix string_compare", "morgan reverse", "rohan sort", "andy reverse", "morgan sqrt"});
        for (String arg : answer) {
            System.out.println(arg);
        }
    }

    public static String[] solution(String logs[]) {
        String[] answer = {};
        ArrayList<String> answers = new ArrayList<String>();

        HashSet<String> hs = new HashSet<>();
        HashSet<String> users = new HashSet<>();
        HashMap<String, Integer> hm = new HashMap<>();

        // hashset에 add해서 중복되는 원소 제거
        for (int i = 0; i < logs.length; i++) {
            hs.add(logs[i]);
        }

        // hashmap에 문제 : 푼 사람의 수 put
        // 한문제 이상 푼 유저 add
        for (String h : hs) {
            String user = h.split(" ")[0];
            String key = h.split(" ")[1];

            users.add(user);
            hm.put(key, hm.getOrDefault(key, 0) + 1);

        }

        int half = (int) Math.ceil((double) hs.size() / 2);
        // ceil(올림) 내의 값은 double이어야 한다. hs.size는 int형이다.
        // half: 참가자의 중간값. 1/2 = 1(☞0.5)

        // 절반 이상이 푼 문제 구하기
        for (String s : hm.keySet()) {
            if (hm.get(s) >= half) {
                answers.add(s);
            }
        }

        // list to array
        answer = answers.toArray(new String[answers.size()]);

        return answer;
    }
}

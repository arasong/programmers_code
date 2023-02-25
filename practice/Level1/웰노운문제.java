package Level1;

import java.util.*;
import java.util.Map.Entry;

public class 웰노운문제 {
    public static void main(String[] args) {
        //String[] answer = solution(new String[]{"kate sqrt"});
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

        // 중복되는 원소 제거
        for (int i = 0; i < logs.length; i++) {
            hs.add(logs[i]);
        }

        // hashmap에 문제 : 푼 사람의 수 put
        // 한문제 이상 푼 유저 add
        for (String s : hs) {
            String[] splitStirng = s.split(" ");
            String user = splitStirng[0];
            String key = splitStirng[1];

            users.add(user);
            hm.put(key, hm.getOrDefault(key, 0) + 1);
        }

        int wellKnownCount = 0;
        if(users.size()%2 == 0){
            wellKnownCount = users.size()/2;
        }else {
            wellKnownCount = users.size()/2 + 1;
        }

        // 절반 이상이 푼 문제 구하기
        Iterator<Entry<String, Integer>> iterator = hm.entrySet().iterator();
        ArrayList<String> result = new ArrayList<>();
        while (iterator.hasNext()) {
            Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() >= wellKnownCount){
                result.add(entry.getKey());
            }
        }
        // list to array
        answer = result.toArray(new String[answers.size()]);

        return answer;
    }
}

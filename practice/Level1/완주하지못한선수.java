package Level1;

import java.util.HashMap;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.println(solution(participant, completion));
    }
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> hm = new HashMap<>();
        // 참가자
        for (String s : participant) {
            hm.put(s, hm.getOrDefault(s,0) + 1);
        }
        // 완주자
        for (String s : completion) {
            hm.put(s, hm.getOrDefault(s, 0) - 1);
        }

        for (String s : hm.keySet()) {
            if(hm.get(s) != 0){
                answer = s;
            }
        }
        return answer;
    }
}

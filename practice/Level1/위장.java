package Level1;

import java.util.*;

public class 위장 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(clothes));
    }

    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i=0; i<clothes.length; i++){
            String key = clothes[i][1];
            hm.put(key, hm.getOrDefault(key, 0) + 1);
        }
        Iterator<Integer>it = hm.values().iterator();
        while (it.hasNext()){
            answer *= it.next().intValue()+1;
        }
        return answer-1;
    }
}

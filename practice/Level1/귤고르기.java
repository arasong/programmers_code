package Level1;

import java.util.*;


public class 귤고르기 {
    public static void main(String[] args) {
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(solution(6,tangerine));
    }
    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i : tangerine) {
            if (hash.containsKey(i)) {
                hash.put(i, hash.get(i) + 1);
            } else {
                hash.put(i, 1);
            }
        }

        List<Integer> list=new ArrayList<>(hash.values());
        Collections.sort(list, Collections.reverseOrder());

        for(Integer a:list){
            k-=a;
            answer++;
            if(k<1){
                return answer;
            }
        }

        return answer;
    }
}

package Level1;

import java.util.*;

public class 베스트앨범 {
    public static void main(String[] args) {
        solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500});
    }

    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = new int [genres.length];
        int MAX = -1;
        int max = -1;
        int idx = 0;
        String max_genres = "";

        HashMap<String, Integer> hm = new HashMap<>();
        // 장르별 total 재생수 map
        for(int i=0; i< genres.length; i++){
            String key = genres[i];
            hm.put(key, hm.getOrDefault(key, 0) + plays[i]);
        }

        //재생 수 순으로 정렬
        List<String> valueList = new ArrayList<>(hm.keySet());
        valueList.sort(String::compareTo);


        return answer;
    }
}

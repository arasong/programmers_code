package Level1;

import java.util.HashMap;

public class 할인행사 {
    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        System.out.println(solution(want, number, discount));
    }

    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        HashMap<String, Integer> want_map = new HashMap<>();
        HashMap<String, Integer> sale_map = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            want_map.put(want[i], number[i]);
        }

        for (int i = 0; i < 10; i++) {
            sale_map.put(discount[i], sale_map.getOrDefault(discount[i], 0) + 1);
        }

        //want_map이랑 sale_map 비교
        if (isSame(want_map, sale_map)) {
            answer++;
        }

        //두번째날부터는 삭제할 상품 과 추가할 상품을 지정하여 sale_map을 업데이트 하고
        //업데이트 된 내용을 바탕으로 isSame 메서드를 실행하여 answer의 값을 변경한다.
        for (int i = 0; i < discount.length - 10; i++) {
            // 상품을 삭제
            String delete = discount[i];
            sale_map.put(delete, sale_map.getOrDefault(delete, 0) - 1);
            // 상품을 추가
            String add = discount[i + 10];
            sale_map.put(add, sale_map.getOrDefault(add, 0) + 1);
            if (isSame(want_map, sale_map)) {
                answer++;
            }
        }

        return answer;
    }

    public static boolean isSame(HashMap<String, Integer> want, HashMap<String, Integer> discount) {
        for (String s : want.keySet()) {
            if (!discount.containsKey(s) || want.get(s) > discount.get(s)) {
                return false;
            }
        }
        return true;
    }
}

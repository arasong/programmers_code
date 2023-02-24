package Level1;

import java.util.*;

public class 폰켓몬 {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,2};
        System.out.println(solution(nums));
    }
    public static int solution(int[] nums) {
        int answer = 0; // 최대 고를 수 있는 폰켓몬 종류의 수

        HashSet<Integer> hs = new HashSet<>();
        for(int i =0; i<nums.length;i++) {
            hs.add(nums[i]);
        }

        if(nums.length/2 < hs.size()){
            answer = nums.length/2;
        } else {
            answer = hs.size();
        }
        return answer;
    }
}

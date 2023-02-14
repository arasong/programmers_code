import java.util.*;

public class 진료순서정하기 {
    public static void main(String[] args) {
        int[] emer = {3, 76, 24};
        Arrays.stream(solution(emer)).forEach(a -> System.out.println(a));
    }
    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] asc = Arrays.copyOf(emergency, emergency.length);

        Arrays.sort(asc);

        for(int i=0; i<emergency.length; i++){
            for(int j=0; j<emergency.length; j++){
                if(asc[i] == emergency[j]){
                    answer[j] = emergency.length-i;
                }
            }
        }
        return answer;
    }
}

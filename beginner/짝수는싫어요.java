import java.util.ArrayList;
import java.util.List;

public class 짝수는싫어요 {
    public static void main(String[] args) {
        solution(15);
    }
    public static int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i % 2 == 1) {
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }

}

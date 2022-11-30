public class 피자나눠먹기3 {
    public static void main(String[] args) {
        System.out.println(solution(4,12));
    }
    public static int solution(int slice, int n) {
        int answer = 0;
        if(n%slice != 0) answer = n/slice +1;
        else answer = n/slice;
        return answer;
    }
}

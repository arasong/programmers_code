public class 배열의평균값 {
    public static void main(String[] args) {
        System.out.println(solution(4));
    }

    public static int solution(int n) {
        int answer = 1;
        while(true){
            if(6*answer%n==0) break;
            answer++;
        }
        return answer;
    }
}

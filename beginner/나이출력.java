public class 나이출력 {
    public static void main(String[] args) {
        System.out.println(solution(40));
    }

    public static int solution(int age) {
        int answer = 0;
        answer = 2022 - age + 1;
        return answer;
    }
}

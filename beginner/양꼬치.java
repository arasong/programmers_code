public class 양꼬치 {
    public static void main(String[] args) {
        System.out.println(solution(64,6));
    }
    public static int solution(int n, int k) {
        int answer = 0;
        int discount = (n/10) * 2000;
        n *= 12000;
        k *= 2000;
        answer = n + k - discount;
        return answer;
    }
}

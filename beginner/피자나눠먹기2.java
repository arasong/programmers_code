public class 피자나눠먹기2 {

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
    public static int solution(int n) {
        int answer = 0;
        int p = 6;
        while ( p % n != 0){
            p += 6;
        }
        return p/6;
    }
}

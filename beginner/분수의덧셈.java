public class 분수의덧셈 {
    public static void main(String[] args) {

    }
    public static int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int denum = denum1 * num2 + denum2 * num1;
        int num = num1 * num2;
        int gcd = cal_gcd(denum,num);

        answer[0] = denum/gcd;
        answer[1] = num/gcd;

        return answer;
    }
    public static int cal_gcd(int a, int b) {
        if(b == 0) return a; //b가 0이될때까지
        //gcd(a,b) = gcd(b,r) (r=a%b)
        return cal_gcd(b,a%b);
    }
}

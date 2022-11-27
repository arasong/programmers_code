import static java.lang.Math.abs;
import static java.lang.Math.round;

public class 두수의나눗셈 {
    public static void main(String[] args) {
        System.out.println(solution(1,16));
    }
    public static int solution(int num1, int num2) {
        double answer = (double) num1 / num2 * 1000;
        return (int)answer;
    }
}

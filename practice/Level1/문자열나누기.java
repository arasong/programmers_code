package Level1;

public class 문자열나누기 {

    public static void main(String[] args) {
        System.out.println(solution("abracadabra"));
    }

    public static int solution(String s) {
        int answer = 0;
        char init = s.charAt(0);
        int count = 0;

        for (char c : s.toCharArray()) {
            if (count == 0) {
                init = c;
            }
            if (init == c) {
                count++;
            } else {
                count--;
            }
            if (count == 0) { // x가 나온 경우와 다른 글자가 나온 경우가 같을 때
                answer++; // 문자열을 분리하는 횟수
            }
        }

        if (count > 0) {
            answer++;
        }

        return answer;
    }
}

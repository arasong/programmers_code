public class 문자반복출력하기 {
    public static void main(String[] args) {
        System.out.println(solution("hello", 3));
    }
    public static String solution(String my_string, int n) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            for(int j=0; j<n; j++){
             answer += Character.valueOf(my_string.charAt(i));
            }
        }
        return answer;
    }
}

public class 외계행성의나이 {
    public static void main(String[] args) {
        System.out.println(solution(23));
    }
    public static String solution(int age) {
        String answer = "";
        String str = Integer.toString(age);
        char[] chars = str.toCharArray();
        for(char c : chars){
            int i = c + 49;
            answer += (char)i;
        }
        return answer;
    }
}

public class 배열자르기 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        solution(numbers,1,3);
    }
    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1 + 1];
        int index = 0;
        for(int i=num1; i<=num2; i++){
            answer[index++] = numbers[i];
        }
        return answer;
    }
}

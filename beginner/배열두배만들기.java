public class 배열두배만들기 {
    public static void main(String[] args) {
        int[] num = {1, 2, 100, -99, 1, 2, 3};
        int[] answer = solution(num);
    }
    public static int[] solution(int[] numbers) {
        for(int x=0; x<numbers.length; x++){
            numbers[x] = numbers[x] * 2;
        }
        return numbers;
    }
}

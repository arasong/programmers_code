public class 배열뒤집기 {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        solution(num_list);
    }
    public static int[] solution(int[] num_list){
        int[] answer = new int[num_list.length];
        int i = 0;
        for(int x=num_list.length-1; x>=0; x--){
            answer[i++] = num_list[x];
        }
        return answer;
    }
}

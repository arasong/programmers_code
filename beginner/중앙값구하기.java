public class 중앙값구하기 {
    public static void main(String[] args) {
        int[] array = new int[] {1, 1, 2, 2};
        System.out.println(solution(array));
    }
    public static int solution(int[] array) {
        int[] bucket = new int[1001];
        for(int x=0; x<array.length; x++){
            bucket[array[x]]++;
        }
        int MAX = 0;
        int index = 0;
        for(int x=0; x<1001; x++) {
            if(bucket[x] >= MAX) {
                if(bucket[x] == MAX ){
                    index = -1;
                }else{
                    MAX = bucket[x];
                    index = x;
                }
            }
        }
        return index;
    }
}

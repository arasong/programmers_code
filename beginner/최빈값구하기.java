public class 최빈값구하기 {
    public static void main(String[] args) {

    }
    public static int solution(int[] array){
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

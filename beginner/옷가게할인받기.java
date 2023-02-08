public class 옷가게할인받기 {
    public static void main(String[] args) {
        System.out.println(solution(580000));
    }

    public static int solution(int price) {
        int answer = 0;
        if(price >= 10 && price <= 1000000){
            if(price >= 500000 && price <= 1000000 ) answer = (int)(price*0.8);
            else if (price >= 300000 && price < 500000 ) answer = (int)(price*0.9);
            else if(price >= 100000 && price < 300000) answer =(int)(price * 0.95);
            else answer = price;
        }
        return answer;
    }
}

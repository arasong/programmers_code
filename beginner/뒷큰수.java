import java.util.Arrays;
import java.util.Stack;

public class 뒷큰수 {
    public static void main(String[] args) {
        int[] numbers = {9, 1, 5, 3, 6, 2};
        solution(numbers);
    }

    public static  int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1); //오큰수 배열은 -1로 초기화
        Stack<node> stack = new Stack<>(); // (수, 인덱스) 형태로 삽입

        for(int i=0; i<numbers.length; i++){
            int x = numbers[i]; // 하나씩 수를 확인
            if(stack.size() == 0 || stack.peek().num >= x) { //뒤에 숫자가 더 작은 경우 (내림차순)
                stack.push(new node(x,i)); //(수,인덱스)형태로 스택에 삽입
            } else { // 뒤에 숫자가 더 큰 경우 (오름차순)
                while (stack.size() > 0 ){ // 역방향으로 하나씩 꺼낸다.
                    node node = stack.pop();
                    int previous = node.num;
                    int index = node.index;
                    if(previous >= x){//크거나 같은 이전 원소를 만났다면 다시 삽입
                        stack.push(new node(previous,index));
                        break;
                    } else {
                        answer[index] = x; //뒷큰수 기록
                    }
                }
                stack.push(new node(x,i)); //(수,인덱스) 형태로 삽입 => 헷갈림
            }

        }
        return answer;
    }

    public static class node{
        int num;
        int index;

        node(int num, int index){
            this.num = num;
            this.index = index;
        }
    }
}

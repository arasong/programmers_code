import java.util.Scanner;

public class 직각삼각형출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int t=0; t<n; t++){
            for(int i=0; i<=t; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

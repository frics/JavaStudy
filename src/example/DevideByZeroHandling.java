package example;

import java.util.Scanner;

public class DevideByZeroHandling {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int dividend; //피제수
        int divisor; //제수
        while(true) {
            System.out.print("뭐를 나눌지: ");
            dividend = s.nextInt();
            System.out.print("뭐로 나눌지: ");
            divisor = s.nextInt();
            try {
                System.out.println(dividend / divisor);
                break;
            }catch(ArithmeticException e){
                System.out.println("다시 입력하시오");
            }
        }
        s.close();

    }
}

package example;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int dividend; //피제수
        int divisor; //제수

        System.out.print("뭐를 나눌지: ");
        dividend = s.nextInt();
        System.out.print("뭐로 나눌지: ");
        divisor = s.nextInt();

        System.out.println(dividend/divisor);
        s.close();
    }
}


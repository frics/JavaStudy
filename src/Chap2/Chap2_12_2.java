package Chap2;

import java.util.Scanner;

public class Chap2_12_2 {
    public static void main(String[] args) {
        System.out.println(("연산>>"));
        Scanner scanner = new Scanner(System.in);
        float var1 = scanner.nextFloat();
        String op = scanner.next();
        float var2 = scanner.nextFloat();
        switch(op){

            case "+":
                System.out.println(var1+ "+"+ var2 +"의 계산 결과는 "+(var1+var2));
                break;
            case "-":
                System.out.println(var1+ "-"+ var2 +"의 계산 결과는 "+(var1-var2));
                break;
            case "*":
                System.out.println(var1+ "*"+ var2 +"의 계산 결과는 "+(var1*var2));
                break;
            case "/":
                if(var2 == 0)
                    System.out.println("0으로 나눌 수 없습니다.");
                else
                    System.out.println(var1+ "/"+ var2 +"의 계산 결과는 "+(var1/var2));
                break;
        }
    }
}
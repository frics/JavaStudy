package Chap2;

import java.util.Scanner;

public class Chap2_6 {
    public static void main(String[] args) {
        System.out.println(("1~99 사이의 정수를 입려하시오>>"));
        Scanner scanner = new Scanner(System.in);
        int var = scanner.nextInt();
        int ten = var % 10;
        int one = var / 10;

        if ((ten == 3 || ten ==6 || ten ==9)  && (one == 3 || one ==6 || one ==9))
            System.out.println("박수짝짝");
        else if((ten == 3 || ten ==6 || ten ==9) || (one == 3 || one ==6 || one ==9))
            System.out.println("박수짝");
    }
}
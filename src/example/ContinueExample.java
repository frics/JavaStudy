package example;

import java.util.Scanner;

public class ContinueExample {
    public static void main(String[] args){
        int sum=0;
        Scanner s = new Scanner(System.in);

        System.out.println("정수 5개를 입력하세요");
        for(int i=0; i<5; i++){
            int n = s.nextInt();
            if(n<0) {
                i--;
                continue;
            }
            else
                sum+=n;
        }
        System.out.println("양수의 합은 "+sum);
    }
}

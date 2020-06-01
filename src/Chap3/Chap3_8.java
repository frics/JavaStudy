package Chap3;

import java.util.Scanner;

public class Chap3_8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int len;
        for(;true;) {
            System.out.print("정수 몇개? ");
            len = scanner.nextInt();
            if(len>0 &&len <100)
                break;
            else
                System.out.println("범위를 벗어납니다.");
        }
        int arr[]= new int [len];

        for(int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*100+1);
            for(int j= i-1; j>0; j--){ //중복이 있는지 지금까지 배열에 넣은 숫자를 검사
                if(arr[i] == arr[j]) { //지금까지 넣은거만 검사해서 불필요한 반복문 비교를 줄임
                    //System.out.println("중복!!");
                    i--;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
            if(((i+1)%10) == 0)
                System.out.println();
        }
    }
}

package example;

import java.util.Scanner;

public class ArrayAcess {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int intArray[] = new int[5];

        int max=0;
        System.out.println("양의 정수 5개 입력");
        for(int i=0; i<5; i++){
            intArray[i] = s.nextInt();
            if(intArray[i]>max)
                max = intArray[i];
        }
        System.out.println("가장 큰 수는 "+max);
        s.close();
    }
}

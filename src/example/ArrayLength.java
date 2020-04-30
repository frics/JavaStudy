package example;

import java.util.Scanner;

public class ArrayLength {
    public static void main(String[] args){
        int intArray[] = new int[5];
        int sum =0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("input 5 prime number >>>");
        for(int i=0; i<intArray.length; i++)
            intArray[i] = scanner.nextInt();
        for(int i=0; i<intArray.length; i++)
            sum+=intArray[i];
        System.out.println("평균은 "+(double)sum/intArray.length+"입니다.");
        //(double)sum/intArray.length 얘는 sum을 미리 실수형으로 바꿔서 나눠도 값이 안짤리게 준비
        // double)(sum/intArray.length) 얘는 이미 계산된거를 실수형으로 바꿔서 이미 소수점이 잘려서 의미 없음
        scanner.close();

    }
}

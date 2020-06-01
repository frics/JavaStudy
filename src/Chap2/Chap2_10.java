package Chap2;

import java.util.Scanner;

public class Chap2_10 {
    public static void main(String[] args) {
        System.out.println(("첫번째 원의 중심과 반지름 입력>>"));
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int r1 = scanner.nextInt();
        System.out.println(("두번째 원의 중심과 반지름 입력>>"));
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int r2 = scanner.nextInt();
        if(r1+r2 >= Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))) //두 원이 서로 맞닿는것도 겹치는 것으로 취급
            System.out.println("두 원은 서로 겹친다.");
        else
            System.out.println("두 원은 서로 겹치지 않는다.");


    }
}


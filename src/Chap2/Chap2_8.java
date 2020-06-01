package Chap2;

import java.util.Scanner;

public class Chap2_8 {
    public static void main(String[] args) {
        System.out.println(("두점 (x1,y1), (x2,y2)을 입력하시>>"));
        Scanner scanner = new Scanner(System.in);
        int x1= scanner.nextInt();
        int y1= scanner.nextInt();
        int x2= scanner.nextInt();
        int y2= scanner.nextInt();
        int a =100;
        int b =200;

        if(inRect(x1,y1,a, a, b,b) || inRect(x2,y2,a, a, b,b) //입력한 두점이 주어진 사각형과 겹치는지 확인
                || inRect(a,a, x1, y1, x2, y2) || inRect(b, b, x1, y1, x2, y2)  // 주어진 사각형이 입력한 두점으로 그린 사각형 안에 있는지
                || inRect(x1, y2, a, a, b, b) || inRect(x2, y1, a, a, b, b)) //입력한 두점 외에 다른 두점이 주어진 사각형에 있는지
            System.out.println("직사각형이 충돌합니다.");
        else
            System.out.println("직사각형이 충돌하지 않습니다.");
    }
    private static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2){
        return (x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2);
    }
}

package example;

import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("exit 입력시 종료");
        while(true){
            System.out.print(">>");
            String t = scanner.next();
            if(t.equals("exit"))
                break;
        }
        System.out.println("프로그램 종료!");
        scanner.close();
    }
}

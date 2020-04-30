import java.util.Scanner;

public class Chap3_16 {
    public static void main(String[] args){
        String str[] = {"가위", "바위", "보"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        for(;true;){
            System.out.print("가위 바위 보!>>");
            String rsp = scanner.next();
            if(rsp.equals("그만"))
                break;
            int computer = (int)(Math.random()*3);
            switch (str[computer]) {
                case "가위":
                    if (rsp.equals("가위"))
                        System.out.println("사용자 = " + rsp + ", 컴퓨터 = " + str[computer] + ", 비겼습니다.");
                    else if (rsp.equals("바위"))
                        System.out.println("사용자 = " + rsp + ", 컴퓨터 = " + str[computer] + ", 사용자가 이겼습니다.");
                    else
                        System.out.println("사용자 = " + rsp + ", 컴퓨터 = " + str[computer] + ", 사용자가 졌습니다.");
                    break;
                case "바위":
                    if (rsp.equals("가위"))
                        System.out.println("사용자 = " + rsp + ", 컴퓨터 = " + str[computer] + ", 사용자가 졌습니다.");
                    else if (rsp.equals("바위"))
                        System.out.println("사용자 = " + rsp + ", 컴퓨터 = " + str[computer] + ", 비겼습니다.");
                    else
                        System.out.println("사용자 = " + rsp + ", 컴퓨터 = " + str[computer] + ", 사용자가 이겼습니다.");
                    break;
                case "보":
                    if (rsp.equals("가위"))
                        System.out.println("사용자 = " + rsp + ", 컴퓨터 = " + str[computer] + ", 사용자가 이겼습니다.");
                    else if (rsp.equals("바위"))
                        System.out.println("사용자 = " + rsp + ", 컴퓨터 = " + str[computer] + ", 사용자가 졌습니다.");
                    else
                        System.out.println("사용자 = " + rsp + ", 컴퓨터 = " + str[computer] + ", 비겼습니다.");
                    break;
                default:
                    System.out.println("다시 입력하시오");
            }
        }
    }
}

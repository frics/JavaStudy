import java.util.Scanner;

public class Chap2_2 {
    public static void main(String[] args) {
        System.out.println(("2자리수 정수 입력(10~99)>>"));
        Scanner scanner = new Scanner(System.in);
        int var= scanner.nextInt();
        int tmp = var%10;
        var = var/10;

        if(var == tmp)
            System.out.println("YES! 10의 자리와 1의 자리가 같습니다.");
        else
            System.out.println("NO! 10의 자리와 1의 자리가 다릅니다.");

    }
}


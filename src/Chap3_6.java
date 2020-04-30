import java.util.Scanner;

public class Chap3_6 {
    public static void main(String[] args){
        int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};

        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 입력하시오: ");
        int var= scanner.nextInt();

        for(int i=0; i<unit.length; i++){ //돈의 종류만큼 반복문
            int num = var/unit[i];
            if (num != 0) {
                var = var - num*unit[i];
                System.out.println(unit[i]+"원 짜리 : "+ num+"개");
            }
        }
    }
}

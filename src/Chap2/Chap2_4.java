package Chap2;

import java.util.Scanner;

public class Chap2_4 {
    public static void main(String[] args) {
        System.out.println(("정수 3개 입력>>"));
        Scanner scanner = new Scanner(System.in);
        int var1= scanner.nextInt();
        int var2= scanner.nextInt();
        int var3= scanner.nextInt();

        if( var1 > var2 &&  var1 < var3 || var1 < var2 && var1 > var3 )
            System.out.println("중간 값은 "+ var1);
        else if ( var2 > var1 && var2 < var3 || var2 < var1 && var2 > var3)
            System.out.println("중간 값은 "+ var2);
        else
            System.out.println("중간 값은 "+ var3);
    }
}

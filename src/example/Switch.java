package example;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int c = s.nextInt(); //더블형이나 플롯같은 실수형은 스위치에 안박힘

        switch(c){
            case 1+5:
                System.out.println("1+4=5");
        }

    }
}

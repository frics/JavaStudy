package Chap3;

import java.util.Scanner;

public class Chap3_14 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String course [] = { "Java", "example.C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int score [] = {95, 88, 76, 62, 55};
        int check =5;
        for(;true;) {
            System.out.print("과목 이름>>");
            String name = scanner.next();
            if(name.equals("그만")) //"그만" 입력시 프로그램 종료
                break;
            for (int i = 0; i < course.length; i++) { //입력한 과목 이름이 배열에 있는지 확인
                if (course[i].equals(name)) {
                    check = i; //과목이름이 존재하면 check변수에 해당 배열의 번호를 저장 후 반복문 종료
                    break;
                }
            }
            if (check != 5) //현재 주어진 배열의 개수는 5이다. 배열의 범위가 0~4까지 이므로 check를 5로 초기화 해놓은 후 그대로 이면 해당 과목이 존재하지 않는 것이다.
                System.out.println(course[check] + "의 점수는 " + score[check]);
            else
                System.out.println("없는 과목입니다.");

        }

    }
}

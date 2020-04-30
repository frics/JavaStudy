package example;

public class CircleArea {
    public static void main(String[] args){
        final double PI = 3.14; //원주율을 final로 상수 선언

        double radius = 10.0; //반지름
        double circleArea = radius*radius*PI; //원의 면적 계산
        System.out.println("원의 면적 = "+circleArea);
    }
}

package example;

import java.util.Currency;

public class Circle {
    int radius;
    String name;
    public Circle(){ //매개변수 없는 생성자
        this.radius =1; this.name ="";
    }
    public Circle(int radius, String name){ //매개변수 있는 생성자
        this.radius =radius; this.name = name;
    }
    public double getArea(){
        return 3.14*this.radius*this.radius; //radius = ~~.radius
    }

    public static void main(String[] args){
        Circle pizza = new Circle(10, "자바피자");

        double area = pizza.getArea();
        System.out.println(pizza.name+"의 면적은 "+ area);

        Circle donut = new Circle(); //객체 생성, 매개변수 없으므로 반지름은 초기값 1을 가짐
        donut.name = "자바도넛"; //donut 이름 지정
        area = donut.getArea();
        System.out.println(donut.name+"의 면적은 "+ area);
    }
    /* 생성자를 1개 가진 Circle 클래서 예제
    public Circle(){}

    public double getArea(){
        return 3.14*radius*radius; //radius = ~~.radius
    }

    public static void main(String[] args){
        Circle pizza;
        pizza = new Circle(); //Circle 객체 생성
        pizza.radius = 10; //반지름 설정
        pizza.name = "자바피자"; //이름 설정
        double area = pizza.getArea(); //피자 면적 구하기
        System.out.println(pizza.name+"의 면적은 "+area);

        Circle donut = new Circle();
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name+"의 면적은 "+area);

    }*/

}

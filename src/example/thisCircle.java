package example;

public class thisCircle {
    int radius;
    public thisCircle(int radius){
        this.radius = radius;
    }
    public void set(int radius){
        this.radius = radius;
    }
    public static void main(String[] args){
        thisCircle ob1 = new thisCircle(1);
        thisCircle ob2 = new thisCircle(2);
        thisCircle ob3 = new thisCircle(3);
        System.out.println(ob1.radius+" "+ob2.radius+" "+ob3.radius);

        ob1.set(4);
        ob2.set(5);
        ob3.set(6);
        System.out.println(ob1.radius+" "+ob2.radius+" "+ob3.radius);

    }

}

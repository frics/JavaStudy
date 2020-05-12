package example;

class ACircle{
    int radius;
    public ACircle(int radius){
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*this.radius*this.radius;
    }
}
public class CircleArray {
    public static void main(String[] args) {
        ACircle[] c;
        c = new ACircle[5];
       

        for (int i = 0; i < c.length; i++)
            c[i] = new ACircle(i);
        for (int i = 0; i < c.length; i++)
            System.out.print((int) (c[i].getArea()) + " ");
    }
}


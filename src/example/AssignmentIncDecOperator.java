package example;

public class AssignmentIncDecOperator {
    public static void main(String[] args){
        int a =3, b =3, c=3;

        a+=3;
        b*=3;
        c%=2;
        System.out.println(a+" "+b+" "+c+" ");

        int d =3;
        a=d++;
        System.out.println(a+" "+d);
        a= ++d;
        System.out.println(a+" "+d);
        a = d--;
        System.out.println(a+" "+d);
        a = --d;
        System.out.println(a+" "+d);

    }
}

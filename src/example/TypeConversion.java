package example;

public class TypeConversion {
    public static void main(String[] args){
        byte b = 127; //byte는 바이트만 저장하지만 리터럴값이 byte의 범위인 -128~127에 있으면 그냥 저장된다.
        int i =100;

        System.out.println(b+i); //자동으로 byte b가 int형으로 형 변환된다.
        System.out.println(10/4);
        System.out.println(10.0/4);
        System.out.println((char)0X12340041);
        System.out.println((byte)(b+i)); //변환하면 1110 0011이 나오는데 이게 227근데 범위 밖이라 음수로 변환하면 -29가 나옴
        System.out.println((int)2.9+1.8);
        System.out.println((int)(2.9+1.8));
        System.out.println((int)2.9+(int)  1.8);
    }
}

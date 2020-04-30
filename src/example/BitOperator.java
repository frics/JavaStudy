package example;

public class BitOperator {
    public static void main(String[] args){
        short a =(short)0x55ff;
        short b =(short)0x00ff;

        //비트 논리 연산
        System.out.println("비트 연산 결과");
        System.out.printf("%04x\n", (short)(a&b));
        System.out.println((short)(a&b)); //이걸로 뽑으면 숫자로 나옴 ㅋㅋ
        System.out.printf("%04x\n", (short)(a|b));
        System.out.printf("%04x\n", (short)(a^b));
        System.out.printf("%04x\n", (short)(~a));

        byte c = 20; // 0x14
        byte d = -8; //0xf8

        //시프트 연산
        System.out.println("시프트 연산 결과");
        System.out.println(c<<2);//2비트 왼쪽 (곱하기 4)
        System.out.println(c>>2); //2비트 오른쪽 (나누기 4)
        System.out.println(d>>2); //2비트 오른족 (나누기 4)
        System.out.printf("%x\n", (d>>>2)); //d를 2비트 오른쪽으로 시프트 (빈자리 0삽입)


    }
}

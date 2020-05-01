package example;

public class GarbageEX {
    public static void main(String[] args){
        String a = new String("Good");
        String b = new String("Normal");
        String c = new String("Bad");
        String d,e;
        a=null; // Good이 가비지가 됨
        d = c;
        c = null;
    }
}

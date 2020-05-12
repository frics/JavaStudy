public class ReturnArray {

    static int[] makeArray(){
        int tmp[] = new int[4];
        for(int i=0; i<tmp.length; i++)
            tmp[i]=i;
        return tmp;
    }
    public static void main(String[] args){
        int intArray[];
        intArray = makeArray();
        for(int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}

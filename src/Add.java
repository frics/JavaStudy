public class Add {
    public static void main(String[] args){
        int sum = 0;

        for(int i=0; i<args.length; i++) {
            try {
                sum += Integer.parseInt(args[i]); //이걸로 double형은 변환이 안되는건지?
            } catch (NumberFormatException e) {
                continue;
            }

        }
        System.out.println(sum);
    }
}

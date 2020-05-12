import java.io.InputStream;
import java.util.Scanner;
/*
public class Characters {
    char[][] chars;

    Characters(char[][] chars) {}

    void print() {
        for(int i =0; i<chars.length; i++){
            for(int j= 0; j<chars[i].length; j++)
                System.out.print(chars[i]);
            System.out.println();
        }
    }

    int getLineCount() {
        //입력한게 몇줄이
    }

    int getCharCountAt(int lineIndex) {
        //해당라인 몇글자?
        //전체 글자 몇글자
    }

    char getCharAt(int rowIndex, int columnIndex) {

    }

    int compareLines(int lineIndex1, int lineIndex2) {

    }

    void sortLines() {

    }

    int getCharCount() {

    }

    char[] to1DArray() {

    }

    int getTokenCount(char delimiter) {

    }

    char[][] split(char delimiter) {

    }

    static Scanner getScanner(InputStream source) {}

    static char[][] addRow(char[][] array) {

    }

    static char[][] scanLines(Scanner scanner) {

        char[][] chars = new char[0][];
        String lines;
        while(true) {
            int cnt=0, tmp;
            lines = scanner.next();

            //chars[cnt] = new char[lines.length()];
            for(int i=0;i<tmp;i++){
                chars[cnt][i]=(lines.charAt(i));//스트링을 한글자씩 끊어 배열에 저장
                System.out.println(chars[cnt][i]); //출력
            }

            // To do: You can type multiple lines of java codes here.
            chars = addRow(chars);
            cnt++;
        }

        // To do: You can type multiple lines of java codes here.

        //return chars;
    }

    static void closeScanner(Scanner scanner) {
        scanner.close();
    }

    public static void main(String[] args) {
        System.out.println("Input multiple lines:");

        Scanner scanner = getScanner(System.in);

        char[][] input = scanLines(scanner);

        closeScanner(scanner);

        System.out.println("*** the input's finished ***");

        Characters lines = new Characters(input);

        System.out.println("*** print the only field chars of this class ***");
        lines.print();
        System.out.println("*** print the only field chars of this class ***");

        System.out.println("*** line count ***");
        System.out.println(lines.getLineCount());
        System.out.println("*** line count ***");

        System.out.println("*** the number of characters in the 1st line ***");
        System.out.println(lines.getCharCountAt(0));
        System.out.println("*** the number of characters in the 1st line ***");

        System.out.println("*** get the total number of characters ***");
        System.out.println(lines.getCharCount());
        System.out.println("*** get the total number of characters ***");

        System.out.println("*** get the 1st char in the 1st line ***");
        System.out.println(lines.getCharAt(0, 0));
        System.out.println("*** get the 1st char in the 1st line ***");

        System.out.println("*** get the 1D array created from the field chars ***");
        System.out.println(lines.to1DArray());
        System.out.println("*** get the 1D array created from the field chars ***");

        System.out.println("*** compare the 1st line and 2nd line ***");
        System.out.println("*** when the 1st line > the 2nd line, print 1 ***");
        System.out.println("*** when the 1st line = the 2nd line, print 0 ***");
        System.out.println("*** when the 1st line < the 2nd line, print -1 ***");
        System.out.println(lines.compareLines(0, 1));
        System.out.println("*** compare the 1st line and 2nd line ***");

        System.out.println("*** sort lines and print***");
        lines.sortLines();
        lines.print();
        System.out.println("*** sort lines and print***");

        System.out.println("*** get token count split with delimiter 's' ***");
        System.out.println(lines.getTokenCount('s'));
        System.out.println("*** get token count split with delimiter 's' ***");

        System.out.println("*** split the field chars with delimiter 's' ***");
        char[][] tokens = lines.split('s');

        Characters split = new Characters(tokens);
        split.print();
        System.out.println("*** split the field chars with delimiter 's' ***");
    }

}*/
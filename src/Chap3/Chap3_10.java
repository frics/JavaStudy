package Chap3;

public class Chap3_10 {
    public static void main(String[] args){
        int matrix[][] = new int[4][4];
        int a;
        int b;
        for(int i=0; i<10; i++){
            a = (int)(Math.random()*4);//a,b를 0~3까지의 렌덤값을 넣어
            b = (int)(Math.random()*4);//임의의 위치를 지정
            if(matrix[a][b] != 0) //a,b에 이미 값이 삽입된 경우 중복검사
                i--;
            matrix[a][b] = (int)(Math.random()*10+1); //1~10까지의 랜덤 값을 위에서 지정한 임의의 위치에 삽입
        }
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

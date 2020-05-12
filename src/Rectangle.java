public class Rectangle {
    private int x, y, width, height;
    private Rectangle(int x, int y, int width, int height){
        this.x = x; this.y = y;
        this.width = width; this.height = height;
    }
    private int square(){
        return width*height;
    }
    private void show(){
        System.out.printf("(%d,%d)에서 크기가  %dX%d인 사각형\n", x, y, width,height);
    }
    private boolean contains(Rectangle rectangle){
        int x1,x2,y1,y2;
        int X1, X2, Y1, Y2;
        x1 = this.x;
        y1 = this.y;
        x2 = this.x+width;
        y2 = this.y+height;
        X1 = rectangle.x;
        Y1 = rectangle.y;
        X2 = rectangle.x+width;
        Y2 = rectangle.y+height;

        return (x1 > X1 && x1 < X2) && (y1 > Y1 && y1 < Y2) && (x2 > X1 && x2 < X2) && (y2 > Y1 && y2 < Y2); //입력한 두점이 주어진 사각형과 겹치는지 확인


    }
    public static void main(String[] args){
        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 "+s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s을 포함합니다.");

    }

}

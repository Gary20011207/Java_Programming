class Rectangle {
    final static int edges = 4; // 矩形的邊數

    private int w; // 矩形的寬
    private int h; // 矩形的高

    Rectangle(int w, int h) { // Constructor(建構方法)
        setWH(w, h);
    }

    Rectangle(int w) {
        this(w, w);
    }

    public int area() { // 計算矩形的面積
        return w * h; // 矩形面積 = 寬 * 高
    }

    public void setWH(int w, int h) { // 同時設定寬與高
        this.w = w; // 設定寬度
        this.h = h; // 設定高度
    }

    public void setWH(int w) { // 設定寬與高相同
        setWH(w, w);
    }

    public boolean largerThan(Rectangle aRectangle) {
        return this.area() > aRectangle.area();
    }
}

public class Program15 {
    public static void main(String argv[]) {
        Rectangle r1 = new Rectangle(5, 10); // 產生第一個矩形
        Rectangle r2 = new Rectangle(10, 15); // 產生第二個矩形
        Square s1 = new Square(10); // 產生 1 個方形

        System.out.println("r1 比 r2 大: " + r1.largerThan(r2));
        System.out.println("r2 比 s1 大: " + r2.largerThan(s1));
        System.out.println("s1 比 r1 大: " + s1.largerThan(r1));
    }
}

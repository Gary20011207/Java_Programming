class Rectangle {
    static int edges = 4; // 矩形的邊數
    // final static int edges = 4;

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
}

public class Program9 {
    public static void main(String argv[]) {
        Rectangle r1 = new Rectangle(10); // 產生 1 個矩形物件
        Rectangle r2 = new Rectangle(5, 10); //再產生 1 個矩形物件
        System.out.println("r1 的邊數: " + r1.edges); // 顯示 r1 邊數
        r1.edges = 5; // // 把邊數改為 5
        System.out.println("r2 的邊數: " + r2.edges); // 顯示 r2 邊數
        System.out.println("矩形的邊數: " + Rectangle.edges); // 顯示矩形邊數
    }
}

class Rectangle {
    int w; // 矩形的寬
    int h; // 矩形的高

    public int area() { // 計算矩形的面積
        return w * h; // 矩形面積 = 寬 * 高
    }
}

public class Program1 {
    public static void main(String argv[]) {
        Rectangle r1 = new Rectangle(); // 產生 1 個矩形物件
        r1.w = 10; // 設定矩形的寬
        r1.h = 5; // 設定矩形的高
        System.out.println("r1 的面積: " + r1.area()); // 顯示面積
    }
}

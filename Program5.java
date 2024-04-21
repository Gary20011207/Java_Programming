class Rectangle {
    private int w; // 矩形的寬
    private int h; // 矩形的高

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

public class Program5 {
    public static void main(String argv[]) {
        Rectangle r1 = new Rectangle(); // 產生 1 個矩形物件
        r1.setWH(10); // 設定矩形的寬與高
        System.out.println("r1 的面積: " + r1.area()); // 顯示面積
    }
}

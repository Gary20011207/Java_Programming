class Rectangle implements canCompareArea {
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

    public boolean largerThan(canCompareArea aShape) {
        return this.area() > aShape.area();
    }
}

class Bread {
    // 各種麵包的特性，省略
}

class Toast extends Bread implements canCompareArea {
    int length;

    public Toast(int length) {
        this.length = length;
    }

    public int area() {
        return length * length;
    }
}

interface canCompareArea { // 可比較面積的物件要遵守的規範
    public int area(); // 要能計算面積
}

public class Program17 {
    public static void main(String argv[]) {
        Rectangle r1 = new Rectangle(5, 10); // 產生 1 個矩形
        Toast t1 = new Toast(10); // 產生 1 片吐司
        System.out.println("r1 比 t1 大: " + r1.largerThan(t1));
    }
}

class Square extends Rectangle {
    Square(int length) {
        super(length);
    }

    /*
    public int area() { // 自訂版的面積計算方法
        return (int)Math.pow(w, 2);
    }
    */

    /*
    public int area() { // 自訂版的面積計算方法
        return super.area();
    }
    */
}

public class Program11 {
    public static void main(String argv[]) {
        Square s1 = new Square(10); // 產生 1 個方形
        System.out.println("s1 的面積: " + s1.area()); // 顯示 s1 面積
        System.out.println("方形的邊數: " + Square.edges); // 顯示方形邊數
    }
}

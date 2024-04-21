public class Program2 {
    public static void main(String argv[]) {
        Rectangle r1 = new Rectangle(); // 產生 1 個矩形物件
        r1.w = 10; // 設定矩形的寬
        r1.h = 5; // 設定矩形的高
        System.out.println("r1 的面積: " + r1.area()); // 顯示 r1 面積
        Rectangle r2 = r1; // 讓 r2 指向同一個物件
        r2.w = 5; // 透過 r2 修改矩形的寬
        System.out.println("r1 的面積: " + r1.area()); // 顯示 r1 面積
    }
}

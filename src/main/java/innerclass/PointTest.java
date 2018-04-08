package innerclass;

// 与文件同名的类一定要有public修饰
public class PointTest {
    public static void main(String[] args) {
        Point2d point2d = new Point2d(3, 4);
        System.out.println(point2d.distance());
    }
}

// 这个类一定不能有public修饰
class Point2d{
    double x;
    double y;
    public Point2d(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point2d() {
        this.x = 0;
        this.y = 0;
    }
    
    public double distance() {
        return Math.sqrt(x*x + y*y);
    }
}
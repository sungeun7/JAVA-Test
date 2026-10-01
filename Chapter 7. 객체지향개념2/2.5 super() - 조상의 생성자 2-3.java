class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(int x, int y) {
        super(); // Object();
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x :" + x + ", y :"+ y;
    }
}

class Point3D extends Point {
    int z;

    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    String getLocation() { // 오버라이딩
        return "x :" + x + ", y :" + y + ", z :" + z;
    }
}


class PointTest {
    public static void main(String args[]) {
        Point3D p3 = new Point3D(1,2,3);
    }
}

-----javac-----
PointTest.java:24: cannot find symbol
symbol : constructor Point()
location : class Point
    Point3D(int x, int y, int z) {

    }

Point3D(int x, int y, int z) {
    super(); // Point()를 호출
    this.x = x;
    this.y = y;
    this.z = z;
}

Point3D(int x, int y, int z) {
    // 조상의 생성자 Point(int x, int y, int z)를 호출
    super(x,y);
    this.z = z;
}
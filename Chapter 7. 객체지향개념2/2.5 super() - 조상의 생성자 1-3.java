class Point {
    int x;
    int y;

    Point() {
        this(0,0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point extends Object {
    int x;
    int y;

    Point() {
        this.(0,0);
    }

    Point(int x, int y) {
        super(); // Object();
        this.x = x;
        thsi.y = y;
    }
}
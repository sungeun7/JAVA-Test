class Outer {
    private int iv = 0;
    protected static int cv = 0;

    void myMethod() {
        int lv = 0;
    }
}

class Outer {
    private class InstanceInner {}
    protected static class StaticInner{}

    void myMethod(){
        class LocalInner{}
    }
}


class InnerEx1{
    class InstanceInner{
        int iv = 100;
        // static int cv = 100; // 에러. static 변수를 선언 할 수 없다.
        final static int CONST = 100; // final static은 상수이므로 허용한다.
    }

    static class StaticInner{
        int iv = 200;
        static int cv = 200; // static 클래스만 static멤버를 정의할 수 있다.
    }

    void myMethod() {
        class LocalInner{
            int iv = 300;
            // static int cv = 300; // 에러. static 변수를 선언 할 수 없다.
            final static int CONST = 300; // final static은 상수이므로 허용
        }
    } // void myMethod()
}


class InnerTest {
    public static void main(String args[]) {
        System.out.println(InnerEx1.InstanceInner.CONST);
        System.out.println(InnerEx1.StaticInner.cv);
    }
}
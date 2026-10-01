class Outer {
    private int outerIv = 0;
    static  int outerCv = 0;

    class InstanceInner {
        int iiv  = outerIv; // 1. Outer class's instance variable can be accessed
                            // 외부 클래스의 private 멤버도 접근 가능하다.
        int iiv2 = outerCv; // 2. Outer class's static variable can be accessed
    }

    static class StaticInner {
        // 스태틱 클래스는 외부 클래스의 인스턴스멤버에 접근 할 수 없다.
        // int siv = outerIv; // 3. Outer class's instance variable cannot be accessed
        static int scv = outerCv; // 4. Outer class's static variable can be accessed
    }

    void myMethod() {
        int lv = 0; // 5. Local variable
        final int LV = 0; // 6. Local variable with final modifier
                          // JDK1.8 부터 final 생략 가능

        class LocalInner {
            int liv  = outerIv; // 7. Outer class's instance variable can be accessed
            int liv2 = outerCv; // 8. Outer class's static variable can be accessed
            // int liv3 = lv; // 9. Local variable can be accessed if it is final or effectively final
            int liv4 = LV; // 10. Local variable with final modifier can be accessed
        }
    }
}
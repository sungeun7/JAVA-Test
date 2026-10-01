new 조상클래스이름() {
    // 멤버 선언
}

또는

new 구현인터페이스이름() {
    // 멤버 선언
}

class InnerEx6{
    Object iv = new Object() { void method() {} }; // 익명 클래스
    static Object cv = new Object() { void method() {} }; // 익명 클래스

    void method() {
        Object lv = new Object() { void method() {} }; // 익명 클래스
    };
}
class ExceptionEx23 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main메서드에서 예외가 처리되었습니다.");
        }
    } // main메서드의 끝

    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1에서 예외가 처리되었습니다.");
            throw e; // 예외를 다시 발생시킨다.
        }
    } // method1의 끝
} // 클래스의 끝
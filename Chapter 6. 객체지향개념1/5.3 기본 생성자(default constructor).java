class Data1 {
    int value;
}

class Data2 {
    int value;

    Data2(int x) { // 매개변수가 있는 생성자.
        value = x;
    }
}

class ConstructorTest {
    public static void main(String args[]) {
        Data1 d1 = new Data1(); // 기본 생성자 호출
        Data2 d2 = new Data2(); // compile error 발생. 매개변수가 있는 생성자만 존재하기 때문에 기본 생성자는 자동으로 생성되지 않음.
    }
}
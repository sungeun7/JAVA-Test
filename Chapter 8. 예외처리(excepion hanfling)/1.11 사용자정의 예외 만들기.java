class MyException extends Exception {
    // 에러 코드 값을 저장하기 위한 필드를 추가 했다.
    private final int ERR_CODE;

    MyException(String msg, int errCode) { // 문자열과 에러 코드를 매개변수로 받는 생성자
        super(msg); // 조상인 Exception클래스의 생성자 Exception(String msg)를 호출한다.
        ERR_CODE = errCode;
    }

    MyException(String msg) { // 문자열을 매개변수로 받는 생성자
        this(msg, 100); // 에러 코드의 기본값을 100으로 한다.
    }

    public int getErrCode() { // 에러 코드를 얻을 수 있는 메서드도 추가했다.
        return ERR_CODE; // 이 메서드는 주로 getMessage()와 함께 사용될 것이다.
    }
}
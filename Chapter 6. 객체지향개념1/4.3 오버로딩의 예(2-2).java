// 오버로딩(overloading) : 같은 이름의 메서드를 여러 개 정의하는 것
// 매개변수의 타입이 다르므로 오버로딩이 성립한다.
long add(int a, int b) { return a + b; }
long add(long a, long b) { return a + b; }


// 오버로딩의 올바른 예 - 매개변수는 다른지만 같은 의미의 기능수행
int add(int a, int b) { return a + b; }
long add(long a, long b) { return a + b; }
int add(int[] a) { // 배열의 합
    int result = 0;

    for(int i=0; i < a.length; i++) {
        result += a[i];
    }
    return result;
}
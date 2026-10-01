// 매개변수의 이름이 다른 것은 오버로딩이 아니다.
int add(int a, int b) { return a + b; }
int add(int x, int y) { return x + y; } // 오류 발생

// 리턴타입은 오버로딩의 성립조건이 아니다.
int add(int a, int b) { return a + b; }
long add(int a, int b) { return (long)(a + b); } // 오류 발생
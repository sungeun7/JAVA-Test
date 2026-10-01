class Parent {
    void parentMethod() throws IOException, SQLException {
        //
    }
}

class Child extends Parent {
    void parentMethod() throws IOException {
        //
    }
}

class Child2 extends Parent {
    void parentMethod() throws Exception {
        //
    }
}

/*
1. 선언부가 같아야 한다.(이름, 매개변수, 리턴타입)
2. 접근제어자를 좁은 범위로 변경할 수 없다.
 - 조상의 메서드가 protected라면, 범위가 같거나 넓은 protected나 public으로만 변경할 수 있다.
3. 조상클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.
*/
class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;
    void method() {
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
    }
}


class Parent {
    int x = 10;
}

class Child extends Parent {
    void method() {
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
    }
}


public static void main(String args[]) {
    Child c = new Child();
    c.method();
}


// this - 인스턴스 자신을 가리키는 참조변수. 인스턴스의 주소가 저장되어있음. 모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재
// super - this와 같음. 조상의 멤버와 자신의 멤버를 구별하는데 사용
class A {
    public void MethodA(B b) {
        b.MethodB();
    }
}

class B {
    public void MethodB() {
        System.out.println("Method B");
    }
}

class InterfaceTest {
    public static void main(String args[]) {
        A a = new A();
        a.MethodA(new B());
    }
}


class A {
    public void MethodA(I i) {
        i.MethodB();
    }
}

interface I { void MethodB(); }

class B implements I {
    public void MethodB() {
        System.out.println("MethodB()");
    }
}

class C implements I {
    public void MethodB() {
        System.out.println("MethodB() in C");
    }
}
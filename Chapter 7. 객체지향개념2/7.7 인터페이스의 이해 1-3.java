class B {
    public void method() {
        System.out.println("HmethodInB");
    }
}


interface I {
    public void method();
}

class B implements I {
    public void method() {
        System.out.println("methodInB");
    }
}
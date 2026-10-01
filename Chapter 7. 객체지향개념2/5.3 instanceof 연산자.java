class InstanceofTest {
    public static void main(String arfs[]) {
        FireEngine fe = new FireEngine();

        if(fe instanceof FireEngine) {
            System.out.println("This is a FireEngine instance.");
        }

        if(fe instanceof Car) {
            System.out.println("This is a Car instance.");
        }

        if(fe instanceof Object) {
            System.out.println("This is an Object instance.");
        }
    }
}

void method(Object obj) {
    if(obj instanceof FireEngine) {
        FireEngine fe = (FireEngine)obj;
        fe.water();
    } else if(obj instanceof Car) {
        Car c = (Car)obj;
        c.drive();
    }
}
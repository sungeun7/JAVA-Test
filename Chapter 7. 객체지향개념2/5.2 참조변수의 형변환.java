class Car{
    String color;
    int door;

    void drive() { // 운전하는 기능
        System.out.println("drive, Brrrr~");
    }

    void stop() { // 멈추는 기능
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car { // 소방차
    void water() { // 물뿌리는 기능
        System.out.println("water!!!");
    }
}

class Ambylance extends Car { // 구급차
    void siren() { // 사이렌을 울리는 기능
        System.out.println("siren~~~");
    }
}
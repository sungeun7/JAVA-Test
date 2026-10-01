class Car {
    String color; //색상
    String gearType; //변속기 종류 - auto(자동), manual(수동)
    int door; //문의 개수

   Car() {
        this("white","auto",4);
    }

    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    Car(Car c) { // 인스턴스의 복사를 위한 생성자.
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }
}

class CarTest3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1); // Car(Car c) 를 호출
    }
}


Car(Car c) {
    this(c.color, c.gearType, c.door);
}
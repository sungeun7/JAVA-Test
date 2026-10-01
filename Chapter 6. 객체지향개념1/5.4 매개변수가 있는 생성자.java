class Car {
    String color; // 색상
    String gearType; // 변속기 종류 - auto(자동), manual(수동)
    int door; // 문의 개수

    Car() {} // 기본 생성자
    Car(String c, String g, int d) { // 생성자
        color = c;
        gearType = g;
        door = d;
    }
}


Car c = new Car(); // 기본 생성자 호출
c.color = "white";
c.gearType = "auto";
c.door = 4;

Car c = new Car("white", "auto", 4); // 매개변수가 있는 생성자 호출
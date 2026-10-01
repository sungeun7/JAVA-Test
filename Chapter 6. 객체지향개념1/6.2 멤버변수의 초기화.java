class Car {
    int door = 4; // 기본형(primirive type) 변수의 초기화
    Engine e = new Engine(); // 참조형(reference type) 변수의 초기화
}


Car(String color, String gearType, int door){
    this.color = color;
    this.gearType = gearType;
    this.door = door;
}
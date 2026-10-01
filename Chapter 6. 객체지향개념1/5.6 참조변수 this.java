class Car {
    String color;
    String gearType;
    int door;

   Car() {
        //Card("white", "auto", 4);
        this("white","auto",4);
    }

    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}


    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
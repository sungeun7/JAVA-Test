class Car {
    String color;
    String gearType;
    int door;

   Car() {
        color = "white";
        gearType = "auto";
        door = 4;
    }

    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }

}


    Car() {
        //Card("white", "auto", 4);
        this("white","auto",4);
    }

    Car() {
        door = 5;
        this("white","auto",4);
    }
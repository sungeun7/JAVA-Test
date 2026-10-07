class Person {
    long id;

    public boolean equals(Object obj) { // Object클래스의 equals()메서드를 오버라이딩한다.
        if (obj != null && obj instanceof Person) { // 매개변수로 넘어온 객체가 null이 아니고 Person타입이면
            return id == ((Person)obj).id; // id값이 같으면 true를 반환한다.
            // obj가 Object타입이므로 id값을 참조하기 위해서는 Person타입으로 형변환이 필요하다.
        } else {
            return false; // 그렇지 않으면 false를 반환한다.
            // 타입이 Person이 아니면 값을 비교할 필요도 없다.
        }
    } // equals메서드의 끝

    Person(long id) { // 생성자
        this.id = id;
    }
}
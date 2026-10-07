public String toString() { // Object클래스의 toString()메서드를 오버라이딩한다.
    // Card인스턴스의 kind와 number를 문자열로 만들어 반환한다.
    return "kind: " + kind + ", number: " + number;
}

class Card {
    String kind;
    int number;

    Card() {
        this("SPADE", 1);
    }
    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
}

class CardToString {
    public static void main(String args[]) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.toString()); // toString()메서드 호출
        System.out.println(c2.toString()); // toString()메서드 호출
    }
}
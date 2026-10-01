class Fighter extends Unit implements Fightable {
    public void move(int x, int y) { }
    public void attack(Fightable f) {}
}

Fighter f = new Fighter();
Fightable = new Figther();

void attack(Fightable f) { // fightable 인터페이스를 구현한 클래스의 인스턴스를 매개변수로 받는 메서드
}

Fightable method() { // Fightable 인테페이스를 구현한 클래스의인스턴스를 반환
    return new Fighter();
}
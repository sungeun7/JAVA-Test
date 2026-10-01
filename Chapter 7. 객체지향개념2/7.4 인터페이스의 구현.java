class 클래스이름 implements 인터페이스이름 {
    // 인터페이스에 정의된 추상메서드를 구현해야한다.
}

class Fighter implements Fightable {
    public void move( int x, int y) {}
    public void attack() {}
}

interface Fightable {
    void move(int x, int y);
    void attack(Unit u);
}

abstract class Fighter implements Fightable {
    public void move(int x, int y) {

    }
}

class Fighter extends Unit implements Fightable {
    public void move(int x, int y) {}
    public void attack(Unit u) {}
}
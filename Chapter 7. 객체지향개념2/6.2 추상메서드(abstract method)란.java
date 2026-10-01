/* 주석을 통해 어떤 기능을 수행할 목적으로 작성하였는지 설명한다. */
abstract 리턴타입 메서드이름();

Ex)
/* 지정된 위치(pos)에서 재생을 시작하는 기능이 수행되도록 작성한다. */
abstract void play(int pos);


abstract class Player {
    abstract void play(int pos); // 추상메서드
    abstract void stop(); // 추상메서드
}

class AudioPlayer extends Player {
    void play(int pos) {}
    void srop() {}
}

abstract class AbstractPlayer extends Player{
    void play(int pos) {}
}
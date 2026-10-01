abstract class Player {
    int currentPos; // 현재 Play되고 있는 위치를 저장하기 위한 변수

    Player() { // 추상클래스도 생서치가 있어야 한다.
        currentPos = 0;
    }

    abstract void play(int pos); // 추상메서드
    abstract void stop(); // 추상메서드

    void play() {
        play(currentPos); // 추상메서드를 사용할 수 있다.
    }
}
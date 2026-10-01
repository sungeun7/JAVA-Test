class Tv {
    boolean power; // 전원상태(on/off)
    int channel; // 채널

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
} // 상속

class VCR {
    boolean power; // 전원상태(on/off)
    int couter = 0;
    void power() { power = !power;}
    void play() { /* 내용 생략 */}
    void stop() { /* 내용 생략 */}
    void rew() { /* 내용 생략 */}
    void ff() { /* 내용 생략 */}
} // 포함


class TVCR extends Tv (
    VCR vcr = new VCR();

    void play() {
        vcr.play();
    }

    void stop() {
        vcr.stop();
    }

    void rew() {
        vcr.rew();
    }

    void ff() {
        vcr.ff();
    }
)
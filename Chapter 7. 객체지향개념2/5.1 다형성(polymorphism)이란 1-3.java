class Tv {
    boolean power; // 전원상태(on/off)
    int channel; // 채널

    void power() { power = !power;}
    void channelUp() { ++channel; }
    void channelDowwn() { --channel; }
}

class CaptionTv extends Tv {
    String text; // 캡션내용
    void caption() {

    }
}

Tv t = new Tv();
CaptionTv c = new CaptionTv();

Tv t = new CaptionTv();

CaptionTv c = new CaptionTv();

Tv t = new CaptionTv();
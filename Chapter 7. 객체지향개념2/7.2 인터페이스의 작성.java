interface 인터페이스이름{
    public static final 타입 상수이름 = 값;
    public abstract 메서드이름(매개변수목록);
}

// 모든 멤버변수는 public static final 이어야 하며, 이를 생략할 수 있다.
// 모든 메서드는 public abstract 이어야 하며, 이를 생략할 수 있다.

interface PllayingCard {
    public static final int SPADE = 4;
    final int DIAMOND = 3; // public static final int DIAMOND = 3;
    static int HEART = 2; // public static final int HEART = 2;
    int CLOVER = 1; // public static final int CLOVER = 1;

    public abstract String getCardNumber();
    String gerCardKind(); // public abstract Strinf getCardKind();
}
class InitBlock{
    static { /* 클래스 초기화 블럭 입니다. */}

    { /* 인스턴스 초기화 블럭 입니다. */}
}


class StaticBlockTest {
    static int[] arr = new int[10]; // 명시적 초기화

    static { // 배열 arr을 1~10 사이의 값으로 채운다.
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10) + 1;
        }
    }
}
class Marine { // 보병
    int x, y; // 현재 위치
    void move(int x, int y) { /* 지정된 위치로 이동 */}
    void stop() { /* 현재 위치에 정지 */}
    void stimPack() { /* 스팀팩을 사용한다. */}
}

class Tank { // 탱크
    int x, y; // 현재 위치
    void move(int x, int y) { /* 지정된 위치로 이동 */}
    void stop() { /* 현재 위치에 정지 */}
    void changeMode() { /* 공격모드를 변환한다. */}
}

class Dropship { // 수송선
    int x, y; // 현재 위치
    void move(int x, int y) { /* 지정된 위치로 이동 */}
    void stop() { /* 현재 위치에 정지 */}
    void load() { /* 선택된 대상을 태운다. */}
    void unload() { /* 선택된 대상을 내린다. */}
}


abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop() { /* 현재 위치에 정지 */}
}

class Marine extends Unit { // 보병
    void move(int x, int y) { /* 지정된 위치로 이동 */}
    void stimPack() { /* 스팀팩을 사용한다. */}
}

class Tank extends Unit { // 탱크
    void move(int x, int y) { /* 지정된 위치로 이동 */}
    void changeMode() { /* 공격모드를 변환한다. */}
}

class Dropship extends Unit { // 수송선
    void move(int x, int y) { /* 지정된 위치로 이동 */}
    void load() { /* 선택된 대상을 태운다. */}
    void unload() { /* 선택된 대상을 내린다. */}
}


Unit[] group = new Unit[4];
group[0] = new Marine();
group[1] = new Tank();
group[2] = new Marine();
group[3] = new Dropship();

for(int i = 0; i < group.length; i++) {
    group[i].move(100, 200);
}
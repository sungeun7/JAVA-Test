class Time {
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() { return hour;}

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) return;
        this.hour = hour;
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}


public static void main(String[] args) {
    Time t = new Time(12, 35, 30);
    // System.out.println(t.toString());
    System.out.println(t);
    // t.hour = 13; 에러!!!

    // 현재시간보다 1시간 후로 변경한다.
    t.setHour(t.getHour()+1);
    System.out.println(t);
}
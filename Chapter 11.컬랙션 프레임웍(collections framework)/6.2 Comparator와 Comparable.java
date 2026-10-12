public final class Integer extends Number implements Comparable {
    public int compareTo(Integer anotherInteger) {
        int v1 = this.value;
        int v2 = anotherInteger.value;
        // 같으면 0, 오른쪽 값이 크면 -1, 왼쪽 값이 크면 1을 반환한다.
        return (v1 < v2 ? -1 : (v1 == v2 ? 0 : 1));
    }
}

public interface Comparator {
    int compare(Object o1, Object o2); // 두 객체를 비교하는 메서드
    boolean equals(Object obj); // equals를 오버라이딩하라는 뜻
}

public interface Comparable {
    int compareTo(Object o); // 주어진 객체(o)와 자신을 비교하는 메서드
}
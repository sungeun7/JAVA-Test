public static void main(String[] args) {
    Integer[] arr = { 30, 50, 10, 40, 20 };

    Arrays.sort(arr); // 기본 정렬기준(Comparable)을 사용하여 정렬
    System.out.println(Arrays.toString(arr));

    // sort(Object[] objArr, Comparator c)
    Arrays.sort(arr, new DescComp()); // DescComp에 구현된 정렬기준으로 정렬
    System.out.println(Arrays.toString(arr));
}

public final class Integer extends Number implements Comparable {
    public int compareTo(Integer anotherInteger) {
        int v1 = this.value;
        int v2 = anotherInteger.value;
        // 같으면 0, 오른쪽 값이 크면 -1, 왼쪽 값이 크면 1을 반환한다.
        return (v1 < v2 ? -1 : (v1 == v2 ? 0 : 1));
    }
}

class DescComp implements Comparator {
    public int compare(Object o1, Object o2) {
        if(!(o1 instanceof Integer)) return -1;
        if(!(o2 instanceof Integer)) return -1;
        Integer i = (Integer) o1;
        Integer i2 = (Integer) o2;
        return i.compareTo(i2) * -1; // 내림차순으로 정렬하기 위해 -1을 곱한다.
    }
}
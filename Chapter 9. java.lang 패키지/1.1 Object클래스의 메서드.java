protected Object clone() // Object클래스의 clone()메서드는 객체를 복제하여 새로운 객체를 생성한다.
// 객체 자신의 복사본을 반환한다.

public boolean equals(Object obj) // Object클래스의 equals()메서드는 두 객체가 같은지 비교한다.
// 객체 자신과 객체 obj가 같은 객체인지 알려준다. (같으면 true)

protected void finalize() // Object클래스의 finalize()메서드는 객체가 소멸되기 직전에 호출된다.
// 객체가 소멸될 때 가비지 컬렉터에 의해 자동적으로 호출된다. 이 때 수행되어야하는 코드가 있는 경우에만 오버라이딩한다.

public Class getClass() // Object클래스의 getClass()메서드는 객체의 클래스 정보를 반환한다.
// 객체 자신의 클래스 정보를 담고 있는 Class인스턴스를 반환한다.

public int hashCode() // Object클래스의 hashCode()메서드는 객체의 해시코드값을 반환한다.
// 객체 자신의 해시코드값을 반환한다. (같은 객체라면 같은 해시코드값을 반환한다.)

public String toString() // Object클래스의 toString()메서드는 객체의 문자열 표현을 반환한다.
// 객체 자신의 정보를 문자열로 반환한다. (객체의 클래스 이름과 해시코드값을 16진수로 변환한 문자열을 반환한다.)

public void notify() // Object클래스의 notify()메서드는 대기중인 스레드를 깨운다.
// 객체 자신을 사용하려고 기다리는 스레드를 깨운다.

public void notifyAll() // Object클래스의 notifyAll()메서드는 대기중인 모든 스레드를 깨운다.
// 객체 자신을 사용하려고 기다리는 모든 스레드를 깨운다.

public void wait() // Object클래스의 wait()메서드는 스레드를 일시정지 시킨다.
public void wait(long timeout) // Object클래스의 wait(long timeout)메서드는 스레드를 일시정지 시킨다.
public void wait(long timeout, int nanos) // Object클래스의 wait(long timeout, int nanos)메서드는 스레드를 일시정지 시킨다.
// 다른 스레드가 notify()나 notifyAll()을 호출할 때까지 현재 스레드를 무한히 또는 지정된 시간(timeout, nanos)동안 기다리게 한다.
// (timeout시간이 경과하면 자동적으로 깨어난다.) (timeout은 천 분의 1초 단위, nanos는 10억분의 1초 단위이다.)
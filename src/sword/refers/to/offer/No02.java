package sword.refers.to.offer;

public class No02 {
	/**
	 * ���һ���࣬����ֻ�����ɸ����һ��ʵ����
	 */
	public static void main(String[] args) {
		System.out.println();
		
	}

}

// ����ʽ �̰߳�ȫ
class A {
	private static final A a = new A();
	private A() {
	}
	public static A getInstance() {
		return a;
	}
}

// ����ʽ �̰߳�ȫд��
class B {
	private static volatile B b = null;
	private B() {
	}
	public static B getInstance() {
		if (b == null) {
			synchronized (B.class) {
				if (b == null)
					b = new B();
			}
		}
		return b;
	}
}

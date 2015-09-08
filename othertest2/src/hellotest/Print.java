package hellotest;
final class Print<E> {
	public static final <E> void print(E data) {
		System.out.print(data);
	}

	public static final <E> void println(E data) {
		System.out.println(data);
	}

	public static final void println() {
		System.out.println();
	}
}

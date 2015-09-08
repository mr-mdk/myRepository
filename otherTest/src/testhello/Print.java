package testhello;




final class Print {
	public  final <E> void print(E data) {
		System.out.print(data);
	}

	public  final <E> void println(E data) {
		System.out.println(data);
	}

	public  final void println() {
		System.out.println();
	}
}

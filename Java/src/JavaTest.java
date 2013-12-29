public class JavaTest {
	public static void main(String[] args) {
		calcGraph(8);
	}

	public static void printGraph(int x) {
		for (int i = 0; i < x; i++) {
			System.out.print("*");

		}
		System.out.println("");
	}

	public static void calcGraph(int x) {
		for (int i = x; 0 < i; i--) {
			printGraph(i * i);
		}
		for (int i = 0; i <= x; i++) {
			printGraph(i * i);
		}
	}
}

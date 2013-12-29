public class Java8_2 {
	public static void main(String[] args) {
		printArc(8);
	}

	public static void printGraph(int x) {
		for (int i = 0; i < x; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}

	public static void printArc(int x) {
		for (int i = -x; i <= x; i++) {
			printGraph(i * i);
		}
	}
}

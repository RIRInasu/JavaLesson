package ge;

public class ExceptionTest2 {

	public static void myAssign(int[] myarray, int pos, int x) {
		System.out.println("myiAssignに来ました");
		try {
			System.out.println("代入します");
			myarray[pos] = x;
			System.out.println("代入しました");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("代入できませんでした");
			System.out.println("例外は" + e + "です");

		}
		System.out.println("myAssignから帰ります");

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] myarray = new int[3];
		myAssign(myarray, 100, 0);

		System.out.println("終了します");

	}
}

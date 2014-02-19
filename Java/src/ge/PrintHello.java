package ge;

class LabelPrinter extends Thread {
	String label = "no label";

	LabelPrinter(String label) {
		this.label = label;
	}

	public void run() {
		while (true) {
			System.out.println(label);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class PrintHello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new LabelPrinter("こんにちは").start();
		new LabelPrinter("こんばんは").start();
		new LabelPrinter("こんにちは").start();


	}

}

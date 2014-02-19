package ge;

class BorderPrinter extends Thread {
	String border = "no border";
	int sleepTime = 1000;

	BorderPrinter(String border, int sleepTime) {
		this.border = border;
		this.sleepTime = sleepTime;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(border);
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class PrintBorder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new BorderPrinter("***", 3000).start();
		new BorderPrinter("=====", 5000).start();
	}
}

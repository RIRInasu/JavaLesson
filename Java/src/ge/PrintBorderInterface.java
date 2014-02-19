package ge;

class BorderPrinterInterface implements Runnable {
	String border = "no border";
	int sleepTime = 1000;

	BorderPrinterInterface(String border, int sleepTime) {
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

public class PrintBorderInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Thread(new BorderPrinter("***", 3000)).start();
		new Thread(new BorderPrinter("=====", 5000)).start();
	}
}

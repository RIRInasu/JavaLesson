package ge;

public class OneBankTest extends Thread {

	public void run() {
		while (true) {
			//100yen預入
			OneBank.addMoney(100);
			//100yen引出
			OneBank.addMoney(-100);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new OneBankTest().start();
		new OneBankTest().start();
	}

}

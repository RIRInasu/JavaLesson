package ge;

class MultiThreadJob extends Thread {
	Job job;

	public MultiThreadJob(int jobcount) {
		job = new Job(jobcount);
	}

	public void run() {
		while (true) {
			job.work();
		}

	}
}

public class MultiThreadProgram {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			new MultiThreadJob(i).start();
		}

	}

}

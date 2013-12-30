public class Java10_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student[] data = {
				new Student("吉上博", 65, 90, 100),
				new Student("安倍一馬", 82, 73, 64),
				new Student("伊藤公一", 74, 31, 42),
				new Student("佐藤太郎", 100, 95, 99),
		};
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i] + "\t->" + data[i].total());
		}

	}
}

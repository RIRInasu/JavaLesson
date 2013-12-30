public class Rectangle {
	final static int INITIAL_WIDTH = 100;
	final static int INITIAL_HEIGHT = 50;
	int width;
	int height;
	int x;
	int y;

	Rectangle() {
		setLocation(0, 0);
		setSize(INITIAL_WIDTH, INITIAL_HEIGHT);
	}

	Rectangle(int w, int h) {
		setLocation(0, 0);
		if (w < 0) {
			w = 0;
		}
		if (h < 0) {
			h = 0;
		}
		setSize(w, h);
	}

	Rectangle(int x, int y, int w, int h) {
		if (x < 0) {
			x = 0;
		}
		if (y < 0) {
			y = 0;
		}
		setLocation(x, y);
		if (w < 0) {
			w = 0;
		}
		if (h < 0) {
			h = 0;
		}
		setSize(w, h);
	}

	void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void setSize(int w, int h) {
		width = w;
		height = h;
	}

	public String toString() {
		return "Rectangle(" + x + "," + y + "," + width + "," + height + ")";

	}

	Rectangle intersect(Rectangle r) {
		int xMax = this.x + this.width;
		int yMax = this.y + this.height;
		if(this.x<=r.x&&r.x<=xMax){

		}
		return null;
	}

	int getArea() {
		return width * height;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(123, 45);
		Rectangle r3 = new Rectangle(10, 20, 100, 10);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);

	}

}

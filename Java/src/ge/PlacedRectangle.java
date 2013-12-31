package ge;

public class PlacedRectangle extends Rectangle {
	int x;
	int y;

	PlacedRectangle() {
		setLocation(0, 0);
	}

	PlacedRectangle(int x, int y) {
		setLocation(x, y);
	}

	PlacedRectangle(int x, int y, int width, int height) {
		super(width, height);
		setLocation(x, y);
	}

	void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[(" + x + "," + y + ") " + super.toString() + "]";
	}

	public static void main(String[] args) {
		PlacedRectangle r0 = new PlacedRectangle();
		PlacedRectangle r1 = new PlacedRectangle(12, 34);
		PlacedRectangle r2 = new PlacedRectangle(31, 41, 59, 26);
		System.out.println(r0);
		System.out.println(r1);
		System.out.println(r2);

	}
}

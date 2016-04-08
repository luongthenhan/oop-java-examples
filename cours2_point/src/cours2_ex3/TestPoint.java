package cours2_ex3;

import java.util.ArrayList;

public class TestPoint {

	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(3, 0);
		MyPoint p2 = new MyPoint(0, 4);

		System.out.println(p1.distance(p2));
		System.out.println(p1.distance(5, 6));

		MyPoint[] points = new MyPoint[10];
		for (int i = 0; i < 10; i++) {
			points[i] = new MyPoint(i + 1, i + 1);
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(points[i]);
		}

		ArrayList<MyPoint> plist = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			plist.add(new MyPoint(i + 1, i + 1));
		}

	}

}

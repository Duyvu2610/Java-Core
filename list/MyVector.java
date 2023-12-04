package list;

import java.util.Vector;

public class MyVector {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();

		vector.add(10);
		vector.add(20);
		vector.add(30);

		int elementAtIndex2 = vector.get(2);
		System.out.println("Phần tử tại index 2: " + elementAtIndex2);

		vector.set(1, 25);
		System.out.println("Danh sách sau khi sửa đổi phần tử tại index 1: " + vector);

		vector.removeElement(30);
		System.out.println("Danh sách sau khi xóa phần tử 30: " + vector);
	}
}

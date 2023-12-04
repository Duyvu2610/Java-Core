package list;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("Java");
		arrayList.add("Python");
		arrayList.add("C++");

		System.out.println("ArrayList ban đầu: " + arrayList);

		String elementAtIndex1 = arrayList.get(1);
		System.out.println("Phần tử tại index 1: " + elementAtIndex1);

		arrayList.set(0, "JavaScript");
		System.out.println("ArrayList sau khi sửa đổi: " + arrayList);

		boolean containsJava = arrayList.contains("Java");
		System.out.println("Có \"Java\" trong ArrayList không? " + containsJava);

		boolean isEmpty = arrayList.isEmpty();
		System.out.println("ArrayList có rỗng không? " + isEmpty);

		int size = arrayList.size();
		System.out.println("Kích thước của ArrayList: " + size);

		arrayList.remove("Python");
		System.out.println("ArrayList sau khi loại bỏ \"Python\": " + arrayList);

		System.out.println("Các phần tử trong ArrayList:");
		for (String language : arrayList) {
			System.out.println(language);
		}
		// Sử dụng Iterator để duyệt qua danh sách
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String language = iterator.next();
            System.out.println(language);
        }

	}

}

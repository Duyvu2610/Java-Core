package set;

import java.util.HashSet;
import java.util.Set;

public class MySet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Phần tử trùng lặp, sẽ bị bỏ qua

        // In ra thông tin của Set
        System.out.println("Set: " + set);

        // Kiểm tra sự tồn tại của một phần tử
        boolean tonTai = set.contains("Banana");
        System.out.println("Có Banana trong Set không? " + tonTai);

        // Xóa một phần tử
        set.remove("Orange");
        System.out.println("Set sau khi xóa Orange: " + set);

        // Lấy kích thước của Set
        int size = set.size();
        System.out.println("Kích thước của Set: " + size);
	}
}

package map;

import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("Khóa 3", 30);
        treeMap.put("Khóa 1", 10);
        treeMap.put("Khóa 2", 20);

        System.out.println("TreeMap ban đầu:");
        printTreeMap(treeMap);

        int giaTriKhoa2 = treeMap.get("Khóa 2");
        System.out.println("\nGiá trị của Khóa 2 là: " + giaTriKhoa2);

        boolean tonTaiKhoa1 = treeMap.containsKey("Khóa 1");
        System.out.println("TreeMap có chứa Khóa 1 không? " + tonTaiKhoa1);

        boolean tonTaiGiaTri25 = treeMap.containsValue(25);
        System.out.println("TreeMap có chứa giá trị 25 không? " + tonTaiGiaTri25);

        treeMap.remove("Khóa 3");
        System.out.println("\nTreeMap sau khi xóa Khóa 3:");
        printTreeMap(treeMap);

        System.out.println("\nDuyệt qua các phần tử của TreeMap:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Khóa: " + entry.getKey() + ", Giá trị: " + entry.getValue());
        }
    }

    private static void printTreeMap(TreeMap<String, Integer> treeMap) {
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Khóa: " + entry.getKey() + ", Giá trị: " + entry.getValue());
        }
    }
	
}

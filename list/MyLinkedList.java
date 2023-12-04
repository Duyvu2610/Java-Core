package list;

import java.util.LinkedList;

public class MyLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        System.out.println("Danh sách ban đầu: " + linkedList);

        linkedList.addFirst(5);
        System.out.println("Danh sách sau khi thêm phần tử vào đầu: " + linkedList);

        linkedList.addLast(40);
        System.out.println("Danh sách sau khi thêm phần tử vào cuối: " + linkedList);

        System.out.println("Phần tử đầu tiên: " + linkedList.getFirst());

        System.out.println("Phần tử cuối cùng: " + linkedList.getLast());

        linkedList.remove(Integer.valueOf(20));
        System.out.println("Danh sách sau khi xóa phần tử 20: " + linkedList);
		
	        
	}
}

package list;

import java.util.Stack;

public class MyStack {
	public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        System.out.println("Ngăn xếp ban đầu: " + stack);

        System.out.println("Kích thước của ngăn xếp: " + stack.size());

        System.out.println("Ngăn xếp có rỗng không? " + stack.isEmpty());

        System.out.println("Phần tử ở đỉnh mà không loại bỏ: " + stack.peek());

        System.out.println("Phần tử đã loại bỏ từ đỉnh: " + stack.pop());

        System.out.println("Ngăn xếp sau khi loại bỏ: " + stack);

        System.out.println("Có \"Java\" trong ngăn xếp không? " + stack.search("Java"));

        stack.remove("Python");
        System.out.println("Ngăn xếp sau khi loại bỏ \"Python\": " + stack);
	}
}

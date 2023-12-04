package map;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
	public static void main(String[] args) {
		Map<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Alice", 85);
        studentScores.put("Bob", 92);
        studentScores.put("Charlie", 78);
        studentScores.put("David", 95);

        int bobScore = studentScores.get("Bob");
        System.out.println("Diem cua Bob: " + bobScore);

        System.out.println("Student Scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            String studentName = entry.getKey();
            int score = entry.getValue();
            System.out.println(studentName + ": " + score);
        }

        String studentToCheck = "Charlie";
        if (studentScores.containsKey(studentToCheck)) {
            System.out.println(studentToCheck + " is in the list.");
        } else {
            System.out.println(studentToCheck + " is not in the list.");
        }
	}
}

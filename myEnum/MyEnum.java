package myEnum;

public class MyEnum {
	enum Direction {
		NORTH, SOUTH, EAST, WEST
	}

	public static void main(String[] args) {
		// Sử dụng giá trị Enum
		Direction myDirection = Direction.NORTH;

		// In giá trị của Enum
		System.out.println("My Direction: " + myDirection);

		// Duyệt qua tất cả các giá trị Enum
		System.out.println("All Directions:");
		for (Direction direction : Direction.values()) {
			System.out.println(direction + " at position " + direction.ordinal());
		}

		// Chuyển đổi chuỗi thành Enum
		String directionString = "SOUTH";
		Direction convertedDirection = Direction.valueOf(directionString);
		System.out.println("Converted Direction: " + convertedDirection);
	}
}

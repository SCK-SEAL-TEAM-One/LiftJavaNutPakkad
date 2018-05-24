package lift;

public class ModelLift {

	public static void main(String[] args) {

		System.out.println("Weight status = " + checkWeight(70));
		//checkState(5, 3);
		checkfloor(1, 3);

	}

	public static String checkWeight(int weight) {
		String statusLift;
		if (weight < 1000) {
			statusLift = "up";
		} else {
			statusLift = "stop";
		}
		return statusLift;

	}

	public static String checkState(int floor, int targetfloor) {

		String statusTarget = "";

		if (floor < targetfloor) {
			statusTarget = "up";
		}

		if (floor == targetfloor) {
			statusTarget = "stop";
		}
		
		if(floor > targetfloor) {
			statusTarget = "down";
		}

		return statusTarget;

	}

	public static void checkfloor(int floor, int targetfloor) {

		int current = floor;
		String statusTarget = "";

		for (int i = 1; current <= targetfloor; i ++) {
			
			System.out.println("Floor = " + current + " State : " + checkState(current,targetfloor));
			current += 1;
			
		}
	}
}

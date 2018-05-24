package lift;

public class ModelList {

	public static void main(String[] args) {

		System.out.println("Weight status = " + checkWeight(70));
		checkState(1, 3);
		
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
	
	public static String checkState(int floor,int targetfloor) {
		
		String statusTarget = "";

		while (true) {
			if (floor == targetfloor) {
				statusTarget = "stop";
				System.out.println("Floor = " + floor + " Target status = " + statusTarget);
				break;
			} else if (floor < targetfloor) {
				statusTarget = "up";
				System.out.println("Floor = " + floor + " Target status = " + statusTarget);
				floor += 1;
			} else {
				statusTarget = "down";
				System.out.println("Floor = " + floor + " Target status = " + statusTarget);
				floor -= 1;
			}

		}
		
		return statusTarget;
		
	}
	
//	public static void PrintTarget(String statusTarget,int floor) {
//		System.out.println("Floor = " + floor + " Target status = " + statusTarget);
//	}

}

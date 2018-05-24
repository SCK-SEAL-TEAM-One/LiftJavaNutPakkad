package lift;

import static org.junit.jupiter.api.Assertions.*;
import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.jupiter.api.Test;



class testLift {

	@Test
	public void WeightNotOverload() {
		ModelLift testWegiht = new ModelLift();
		String results = testWegiht.checkWeight(150);
		assertEquals("up", results);
		System.out.println("Weight "+results);
	}

	@Test
	public void WeightOverload() {
		ModelLift testWegiht = new ModelLift();
		String results = testWegiht.checkWeight(1000);
		assertEquals("stop", results);
		System.out.println("Weight "+results);
	}
	
	@Test
	public void FloorState() {
		ModelLift testState = new ModelLift();
		String results = testState.checkState(1,3);
		assertEquals("up", results);
		System.out.println("Floor "+results);
	}
	
	@Test
	public void CheckFloor() {
		ModelLift testFloor = new ModelLift();
		int results = testFloor.checkfloor(3,3);
		assertEquals("stop", results);
		System.out.println("Floor "+results);
	}

}

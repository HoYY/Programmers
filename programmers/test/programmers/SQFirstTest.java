package programmers;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class SQFirstTest {

	SQFirst sqFirst;
	int[] progresses;
	int[] speeds;
	int[] result;
	
	@Before
	public void before() {
		sqFirst = new SQFirst();
		progresses = new int[] {93, 30, 55};
		speeds = new int[] {1, 30, 5};
		result = new int[] {2, 1};
	}
	
	@Test
	public void solutionTest() {
		int[] result = new int[] {2, 1};
		assertArrayEquals(result, sqFirst.solution(progresses, speeds));
	}

}

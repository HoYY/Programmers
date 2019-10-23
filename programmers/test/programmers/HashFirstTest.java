package programmers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HashFirstTest {

	HashFirst hf;
	
	@Before
	public void before() {
		hf = new HashFirst();
	}
	
	@Test
	public void solutionTest() {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		String answer = "leo";
		assertEquals(answer, hf.solution(participant, completion));
	}
}

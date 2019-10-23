package programmers;

import static org.junit.Assert.*;

import org.junit.Test;

public class chestest {

	ches c = new ches();
	
	@Test
	public void test() {
		int result = c.solution(new String[] {"A1"});
		assertEquals(56, result);
	}

}

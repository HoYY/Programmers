package programmers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class wijangTest {

	wijang w;
	
	@Before
	public void start() {
		w = new wijang();
	}
	
	@Test
	public void test() {
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		int result = w.solution(clothes);
		assertEquals(5, result);
	}

}

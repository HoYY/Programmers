package programmers;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class testtest {

	testcode tt;
	int[] answer = {1,2,3,4,5};
	int[] p1;
	int[] p2;
	int[] p3;
	
	@Before
	public void bdfore() {
		tt = new testcode();
		
		p1 = tt.makeP(new int[] {1,2,3,4,5}, answer.length);
        p2 = tt.makeP(new int[] {2,1,2,3,2,4,2,5,2,1,2,3,2,4,2,5}, answer.length);
        p3 = tt.makeP(new int[] {3,3,1,1,2,2,4,4,5,5}, answer.length);
        
        int[] arr = {1,2,3,4};
		for(int i=0; i < 1<<4; i++) {
	        for(int j=0; j<4; j++) {
	            if((i & 1<<j) != 0) 
	                System.out.print(arr[j] + " ");
	        }
	        System.out.println();
	    }
	}
	
	@Test
	public void testt() {
		assertArrayEquals(p1, answer);
	}
	
	@Test
	public void test0() {
		int[] result = tt.solution(new int[] {1,2,3,4,5});
		System.out.println(tt.max);
		assertArrayEquals(new int[] {1},result);
	}
	
	@Test
	public void test1() {
		int[] result = tt.solution(new int[] {1,3,2,4,2});
		System.out.println(tt.max);
		assertArrayEquals(new int[] {1,2,3},result);
	}

}

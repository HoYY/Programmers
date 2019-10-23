package programmers;

import java.util.HashMap;
import java.util.Map;

public class testcode {
	int max = 0;
	public int[] solution(int[] answers) {
        int[] answer = new int[3];
        
        int[] p1 = makeP(new int[] {1,2,3,4,5}, answers.length);
        int[] p2 = makeP(new int[] {2,1,2,3,2,4,2,5,2,1,2,3,2,4,2,5}, answers.length);
        int[] p3 = makeP(new int[] {3,3,1,1,2,2,4,4,5,5}, answers.length);
        
        Map<Integer, Integer> hm = new HashMap<>();
        
        hm.put(1, countAnswer(p1, answers));
        hm.put(2, countAnswer(p2, answers));
        hm.put(3, countAnswer(p3, answers));

        int index = 0;
        for(int j=1; j<4; j++) {
        	if(hm.get(j) == max) {
        		answer[index] = j;
        		index++;
        	}
        }
        int[] a = new int[index];
        for(int k=0; k<a.length; k++) {
        	a[k] = answer[k];
        }
        
        return a;
    }
	
	private Integer countAnswer(int[] p, int[] answers) {
		int answer = 0;
		for(int i=0; i<p.length; i++) {
			if(p[i] == answers[i])
				answer++;
		}
		max = answer>max ? answer : max;
		
		return answer;
	}

	public int[] makeP(int[] p1, int length) {
		int[] p1Array = new int[length];
		int size = p1.length;
		
		for(int i=0; i<length; i++) {
			p1Array[i] = p1[i%size];
		}
		
		return p1Array;
	}
}

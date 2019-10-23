package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class wijang {
	public int solution(String[][] clothes) {
        int answer = 0;
        Map<String, ArrayList<String>> hm = new HashMap<>();
        List<String> keys = new ArrayList<>();
        
        for(String[] cloth : clothes) {
        	if(hm.get(cloth[1]) == null) {
        		ArrayList<String> list = new ArrayList<String>();
        		list.add(cloth[0]);
        		hm.put(cloth[1], list);
        		keys.add(cloth[1]);
        	}
        	else {
        		ArrayList<String> list = hm.get(cloth[1]);
        		list.add(cloth[0]);
        		hm.put(cloth[1], list);
        	}
        }
        
        boolean first=true;
		for(int i=0; i < 1<<keys.size(); i++) {
			int batchResult = 1;
	        for(int j=0; j<keys.size(); j++) {
	            if((i & 1<<j) != 0) {
	                batchResult *= hm.get(keys.get(j)).size();
	            }	
	        }
	        if(!first)
	        	answer+=batchResult;
	        first = false;
	    }
        
        
        return answer;
    }
}

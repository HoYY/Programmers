package programmers;

import java.util.HashMap;
import java.util.Map;

class HashFirst {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        if(completion.length == 0)
            return participant[0];
        
        Map<String, Integer> participants = new HashMap<>();
        for(String participant_s : participant){
            participants.put(participant_s, participants.getOrDefault(participant_s, 0) + 1);
        }
        for(String completion_s : completion){
            participants.put(completion_s, participants.get(completion_s) - 1);
        }
        for(Map.Entry<String, Integer> entry : participants.entrySet()) {
        	if(entry.getValue() != 0)
                return entry.getKey();
        }
        return answer;
    }
}

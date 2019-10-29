package programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

class SQFirst {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        if(progresses.length == 0 || speeds.length == 0)
            return answer;
        
        Queue<Integer> queue = new LinkedList<>();
        addRelease(queue, progresses, speeds);
        int[] result = calculateResult(queue);
        return result;
    }
    
    public void addRelease(Queue<Integer> queue, int[] progresses, int[] speeds){
        int releaseDate;
        for(int i=0; i<progresses.length; i++){
            releaseDate = (100 - progresses[i]) / speeds[i];
            releaseDate = (100 - progresses[i]) % speeds[i] == 0 ? releaseDate : releaseDate++;
            queue.add(releaseDate);
        }
    }
    
    public int[] calculateResult(Queue<Integer> queue){
        List<Integer> resultList = new ArrayList<>();
        int dateCount = 1;
        int date = 0;
        for(int releaseDate : queue){
            if(releaseDate > date) {
            	if(date != 0) {
            		resultList.add(dateCount);
            		dateCount = 1;
            	}
            	date = releaseDate;
            }
            else {
            	dateCount++;
            }
        }
        resultList.add(dateCount);
        
        int size = resultList.size();
        int[] result = new int[size];
        for(int i=0; i<size; i++) {
        	result[i] = resultList.get(i);
        }
        return result;
    }
}

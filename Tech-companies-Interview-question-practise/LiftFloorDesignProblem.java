package smapleQuestionsAlgorithms;
import java.util.*;
import java.util.Map.Entry;


public class LiftFloorDesignProblem {
	HashMap<Integer,Set<Integer>> floorLiftMap =new HashMap<>();
	static int noOfFloors=0;
	
	public void initializeHashMap(int floors,int lifts){
		int i;
		for(i=0;i<floors;i++){
			floorLiftMap.put(i, new HashSet<>());		
		}
	} 
	public void addLift(int floorNo){
		Iterator<Integer> itr=floorLiftMap.keySet().iterator();
		while(itr.hasNext()){
			floorLiftMap.get(itr.next()).add(floorNo);
		}
	}
	
	public int getNearestLift(int floorNo){
		PriorityQueue<Integer> queue =new PriorityQueue<>(new Comparator<Integer>(){
		
			@Override
			public int compare(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				if(Math.abs(floorNo-arg0)>Math.abs(floorNo-arg1)){
					return 1;
				}else if(Math.abs(floorNo-arg0)<Math.abs(floorNo-arg1)){
					return -1;
				}else{
					return 0;
				}
			}
			
		});
		queue.addAll(floorLiftMap.get(floorNo));
		return queue.peek();
	}
	
	public static void main(String[] args){
		LiftFloorDesignProblem obj=new LiftFloorDesignProblem();
		obj.initializeHashMap(5, 3);
		obj.addLift(2);
		obj.addLift(0);
		obj.addLift(3);
		//System.out.println(obj.floorLiftMap.toString());
		System.out.println(obj.getNearestLift(4));
	}
}

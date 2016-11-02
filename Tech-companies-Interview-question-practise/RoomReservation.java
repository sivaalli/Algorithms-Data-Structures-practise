package smapleQuestionsAlgorithms;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class RoomReservation {

	public static void bookRoom(LinkedHashMap<String,LinkedList<Integer>> timeSlots,int roomNum,String startTime,String endTime){
		if(timeSlots.containsKey(startTime)){
			
		}
	}
	public static void initiateRoomNum(Set<Integer> roomNum){
		for(int i=200;i<210;i++){
			roomNum.add(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,LinkedList<Integer>> timeSlots=new LinkedHashMap<>();
		Set<Integer> roomNum=new LinkedHashSet<>();
		initiateRoomNum(roomNum);
		int[] arr={1,2,3,4,5,6};
		timeSlots.put("0900", new LinkedList<>());
		timeSlots.put("0930", new LinkedList<>());
		timeSlots.put("1000", new LinkedList<>());
		timeSlots.put("1030", new LinkedList<>());
		timeSlots.put("1100", new LinkedList<>());
		timeSlots.put("1130", new LinkedList<>());
		timeSlots.put("1200", new LinkedList<>());

		
		
	
	}

}

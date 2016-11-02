package graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class ManagerComplain {
	
	public static String findManager(HashMap<String,String> hashMap,String emp1,String emp2){
		Set<String> set=new HashSet<>();
		while(hashMap.containsKey(emp1) || hashMap.containsKey(emp2)){
			if(hashMap.containsKey(emp1)){
				emp1=hashMap.get(emp1);
			}
			if(hashMap.containsKey(emp2)){
				emp2=hashMap.get(emp2);
			}
			
			if(!set.isEmpty()){
				if(set.contains(emp1)){
					return emp1;
				}
				if(set.contains(emp2)){
					return emp2;
				}
			}
			set.add(emp1);
			set.add(emp2);	
		}
		return "";
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> hashMap=new HashMap<>();
		hashMap.put("pete", "sam");
		hashMap.put("nancy", "pete");
		hashMap.put("katie", "sam");
		hashMap.put("bob", "mary");
		hashMap.put("mary", "frank");
		hashMap.put("sam", "mary");
		hashMap.put("john", "bob");
		System.out.println(findManager(hashMap, "mary", "nancy"));
	}

}

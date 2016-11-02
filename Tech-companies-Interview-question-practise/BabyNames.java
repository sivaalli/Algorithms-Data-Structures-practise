package smapleQuestionsAlgorithms;
import java.util.*;

public class BabyNames {
	private HashMap<String,String> pairs=new HashMap<>();
	 private HashMap<String, Integer> count=new HashMap<>();

	public void getCount(Map<String,Integer> names){
		for(Map.Entry<String, Integer> entry:names.entrySet()){
			String name=entry.getKey();
			int counter=entry.getValue();
			String pair=pairs.get(name);
			if(count.containsKey(pair)){
				count.put(pair, counter+count.get(pair));
			}else{
				if(pairs.containsKey(pair)){
					count.put(pair, counter);
				}else{
					count.put(name, counter);
				}
				
			}
		}
	}
	public void printCount(){
		for(Map.Entry<String, String> entry: pairs.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		for(Map.Entry<String, Integer> entry: count.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	public  void processPairs(ArrayList<String> synonyms){
		int size=synonyms.size();
		int i=0;
		while(i<size-1){
			String name=synonyms.get(i++);
			String pair=synonyms.get(i++);
			if(pairs.containsKey(name)){
				pairs.put(pair, pairs.get(name));
			}else if(pairs.containsKey(pair)){
				pairs.put(name, pairs.get(pair));
			}else{
				pairs.put(name, name);
				pairs.put(pair, name);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyNames obj=new BabyNames();
		ArrayList<String> synonyms=new ArrayList<>();
		synonyms.add("Jon");
		synonyms.add("John");
		synonyms.add("John");
		synonyms.add("Johnny");
		synonyms.add("Chris");
		synonyms.add("Kris");
		synonyms.add("Chris");
		synonyms.add("Christopher");
		Map<String,Integer> names=new HashMap<>();
		names.put("John", 15);
		names.put("Jon", 12);
		names.put("Chris", 13);
		names.put("Kris", 4);
		names.put("Christopher", 19);
		names.put("Shiva", 11);
		obj.processPairs(synonyms);
		obj.getCount(names);
		obj.printCount();
		
	}

}

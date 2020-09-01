package lab1;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Problem3 {

	public static void main(String[] args) {
	
		TreeMap<Date, String> syllabus = new TreeMap<Date, String>();
		
		Date d1 = new Date(12, 19, 2000);
		Date d2 = new Date(9,19,2000);
		Date d3 = new Date(5,20,2002);
		Date d4 = new Date(9,5,2002);
		
		
		syllabus.put(d1,"G"); 
		syllabus.put(d2,"Pass");
		syllabus.put(d3,"Deins");
		syllabus.put(d4,"Yessy");
		
		
		for(Entry<Date, String> topic: syllabus.entrySet()) {
			if(topic.getKey().year == 2002 &&  topic.getKey().month == 9) 
			{
				System.out.println(topic.getValue());
			}else
			{
				System.out.println(topic.getValue() + " out of bounds");
			}
	}

	
	
	
	}
}
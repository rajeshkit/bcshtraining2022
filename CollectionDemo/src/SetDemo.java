import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class SetDemo{
	public static void main(String[] args) {
		
		HashSet<String> cityNames=new HashSet<String>();
		cityNames.add("Pune");
		cityNames.add("Mumbai");
		cityNames.add("Chennai");
		cityNames.add("Hydrabad");
		System.out.println(cityNames);
		
		TreeMap<String,Integer> details=new TreeMap<String,Integer>();
		
		details.put("pune", 679865);
		details.put("mumbai", 568644);
		details.put("chennai", 694940);
		details.put("bangalore", 876776);
		
	
		
		System.out.println("************************");
		System.out.println(details);
		System.out.println("************************");
		
//		Trainee t1=new Trainee(677,"dgdg","t7",6887,"java");
//		Trainee t2=new Trainee(1000,"fhghh","t8",6878,"java");
//		Trainee t3=new Trainee(799,"dgyjg","t9",4657,"java");
//		Trainee t4=new Trainee(500,"nbn","t10",7878,"java");
//		System.out.println("**************************");
//		System.out.println(Integer.compare(45, 45)); // negative, positive, zero
//		System.out.println("**************************");
//		TreeSet<Trainee> traineeList=new TreeSet<>();
//		// implement either Comparable or Comparator
//		traineeList.add(t1);
//		traineeList.add(t3);
//		traineeList.add(t4);
//		traineeList.add(t2);
//		for (Trainee trainee : traineeList) {
//			System.out.println(trainee.toString());
//		}
		
	}
}

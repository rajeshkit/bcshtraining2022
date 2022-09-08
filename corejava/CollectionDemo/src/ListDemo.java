import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListDemo{
	public static void main(String[] args) {
		
		ArrayList<String> cityList=new ArrayList<String>();
		cityList.add("Pune");
		cityList.add("Mumbai");
		cityList.add("chennai");
		cityList.add("Hydrabad");
		cityList.add("Pune");
		cityList.add("Noida");
		System.out.println("Before Sort");
		System.out.println(cityList);
		System.out.println(Collections.frequency(cityList, "Pune"));
		System.out.println("After Sort");
		System.out.println(cityList);
		//3 ways
		// use iterator and iterate the list 
		Iterator<String> itr=cityList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		// use basic for loop
		for (int i = 0; i<cityList.size(); i++) {
			System.out.println(cityList.get(i));
			
		}
		//advanced for loop - for 
		for (String s : cityList) {
			System.out.println(s);
		}
		// for each using lambda jdk 1.8 feature
		cityList.forEach(e->System.out.println(e));
		
		
		
		
		
		
		
		
		
		
		Trainee t1=new Trainee(677,"dgdg","t7",6887,"java");
		Trainee t2=new Trainee(877,"fhghh","t8",6878,"java");
		Trainee t3=new Trainee(799,"dgyjg","t9",4657,"java");
		Trainee t4=new Trainee(899,"nbn","t10",7878,"java");
		
		ArrayList<Trainee> traineeList=new ArrayList<>();
		traineeList.add(t1);
		traineeList.add(t3);
		traineeList.add(t2);
		traineeList.add(t4);
		
		
	}
}

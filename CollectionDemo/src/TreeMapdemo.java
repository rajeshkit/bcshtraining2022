import java.util.TreeMap;

public class TreeMapdemo {
	public static void main(String[] args) {
		Trainee t1=new Trainee(677,"dgdg","t7",6887,"java");
		Trainee t2=new Trainee(1000,"fhghh","t8",6878,"java");
		Trainee t3=new Trainee(799,"dgyjg","t9",4657,"java");
		Trainee t4=new Trainee(500,"nbn","t10",7878,"java");
		System.out.println("**************************");
		System.out.println(Integer.compare(45, 45)); // negative, positive, zero
		System.out.println("**************************");
		TreeMap<String, Trainee> traineeList=new TreeMap<String, Trainee>();
		// implement either Comparable or Comparator
		traineeList.put(t1.getTraineeName(), t1);
		traineeList.put(t3.getTraineeName(), t3);
		traineeList.put(t4.getTraineeName(), t4);
		traineeList.put(t2.getTraineeName(), t2);
		for (String k : traineeList.keySet()) {
			System.out.println(k);
			System.out.println(traineeList.get(k));
		}
	}
}

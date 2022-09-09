import java.util.ArrayList;

public class TraineeCollectionDemo {
		public static void main(String[] args) {
			Trainee t1=new Trainee(677,"dgdg","t7",6887,"java");
			Trainee t2=new Trainee(877,"fhghh","t8",6878,"java");
			Trainee t3=new Trainee(799,"dgyjg","t9",4657,"java");
			Trainee t4=new Trainee(899,"nbn","t10",7878,"java");
			
			ArrayList<Trainee> traineeList=new ArrayList<>();
			traineeList.add(t1);
			traineeList.add(t3);
			traineeList.add(t2);
			traineeList.add(t4);
			
			//iterator
//			Iterator<Trainee> itr=traineeList.iterator();
//			while(itr.hasNext()) {
//				 Trainee t= itr.next();
//				 System.out.println(t.getBatchId());
//				 System.out.println(t.getSalary());
//				 System.out.println(t.getTechnology());
//				 System.out.println(t.getTraineeId());
//				 System.out.println(t.getTraineeName());
//				 System.out.println("***********************");
//			}
			
			
			for (Trainee t : traineeList) {
				
				 System.out.println(t.getBatchId());
				 System.out.println(t.getSalary());
				 System.out.println(t.getTechnology());
				 System.out.println(t.getTraineeId());
				 System.out.println(t.getTraineeName());
				 System.out.println("***********************");
			}
			
			
		}
}

import java.util.TreeSet;

public class TreeSetDemo {
		public static void main(String[] args) {
			TraineeDetails t1=new TraineeDetails(677,"dgdg","t7",6887,"java");
			TraineeDetails t2=new TraineeDetails(1000,"fhghh","t8",6878,"java");
			TraineeDetails t3=new TraineeDetails(799,"dgyjg","t9",4657,"java");
			TraineeDetails t4=new TraineeDetails(500,"nbn","t10",7878,"java");
			TraineeDetailSortByIdComparator tdc=new TraineeDetailSortByIdComparator();
			TreeSet<TraineeDetails> traineeList=new TreeSet<>(tdc);
			// implement either Comparator
			traineeList.add(t1);// tdc.compare(t1,t2);
			traineeList.add(t3);
			traineeList.add(t4);
			traineeList.add(t2);
			for (TraineeDetails trainee : traineeList) {
				System.out.println(trainee.toString());
			}
			System.out.println("******************************");
			TraineeDetailsSortBySalaryComparator tds=new TraineeDetailsSortBySalaryComparator();
			TreeSet<TraineeDetails> tranineeList11=new TreeSet<>(tds);
			// implement either Comparator
			tranineeList11.add(t1);// tdc.compare(t1,t2);
			tranineeList11.add(t3);
			tranineeList11.add(t4);
			tranineeList11.add(t2);
			for (TraineeDetails trainee : tranineeList11) {
				System.out.println(trainee.toString());
			}
			System.out.println("******************************");
			TraineeDetailsSortByNameComparator tdn=new TraineeDetailsSortByNameComparator();
			TreeSet<TraineeDetails> tranineeList111=new TreeSet<>(tdn);
			// implement either Comparator
			tranineeList111.add(t1);// tdc.compare(t1,t2);
			tranineeList111.add(t3);
			tranineeList111.add(t4);
			tranineeList111.add(t2);
			for (TraineeDetails trainee : tranineeList111) {
				System.out.println(trainee.toString());
			}
			
		}
}

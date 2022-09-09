import java.util.Comparator;

public class TraineeDetailsSortBySalaryComparator 
implements Comparator<TraineeDetails>{

	@Override
	public int compare(TraineeDetails o1, TraineeDetails o2) {
		if(o1.getSalary() < o2.getSalary()) {
			return -14;
		}
		if(o1.getSalary() > o2.getSalary()) {
			return 167;
		}
		return 0;
	}

}

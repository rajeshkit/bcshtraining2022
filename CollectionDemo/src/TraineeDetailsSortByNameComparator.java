import java.util.Comparator;

public class TraineeDetailsSortByNameComparator 
implements Comparator<TraineeDetails>{

	@Override
	public int compare(TraineeDetails o1, TraineeDetails o2) {
		int i = o1.getTraineeName().compareTo(o2.getTraineeName());
		return i;
	}

}

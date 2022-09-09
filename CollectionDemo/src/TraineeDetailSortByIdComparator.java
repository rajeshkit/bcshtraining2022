import java.util.Comparator;

public class TraineeDetailSortByIdComparator
implements Comparator<TraineeDetails>{

	@Override
	public int compare(TraineeDetails o1, TraineeDetails o2) {
		// TODO Auto-generated method stub
		if (o1.getTraineeId() < o2.getTraineeId()) {
			return -1;
		}
		if (o1.getTraineeId() > o2.getTraineeId()) {
			return 1;
		}
		return 0;
	}

}

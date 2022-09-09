

public class Trainee implements Comparable<Trainee> {
	private int traineeId;
	private String traineeName;
	private String batchId;
	private long salary;
	private String technology;
	public Trainee() {
		// TODO Auto-generated constructor stub
	}
	public Trainee(int traineeId, String traineeName, String batchId, long salary, String technology) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.batchId = batchId;
		this.salary = salary;
		this.technology = technology;
	}
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	@Override
	public int compareTo(Trainee o) {
		if(this.traineeId<o.traineeId) {
			return -1;
		}
		if(this.traineeId > o.traineeId) {
			return 1;
		}
		return 0;
	}
	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", batchId=" + batchId + ", salary="
				+ salary + ", technology=" + technology + "]";
	}
	
	
	
}

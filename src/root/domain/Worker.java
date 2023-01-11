package root.domain;

import java.time.LocalDate;

public class Worker {
	private int workerId;
	private String workerName;
	private LocalDate joiningDate;
	
	public Worker(int workerId, String workerName, LocalDate joiningDate) {
		this.workerId = workerId;
		this.workerName = workerName;
		this.joiningDate = joiningDate;
	}

	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	
	@Override
	public String toString() {
		return this.workerName;
	}
}

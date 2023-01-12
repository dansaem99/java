package root.domain;

import java.time.LocalDate;

public class Worker {
	private int workerId;
	private String workerName;
	private LocalDate joiningDate;
	private String menu;
	
	public Worker(String menu) {
		this.menu = menu;
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

	public void setMenu(String menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return this.workerName;
	}
}

package root.dao;

import root.domain.Worker;

public interface WorkerDao {
	public Worker selectWorker();
	public void insertWorker(Worker worker);
	public void updateWorker(String workerName);
	public void deleteWorker();
}

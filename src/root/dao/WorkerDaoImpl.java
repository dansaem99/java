package root.dao;

import root.domain.Worker;

public class WorkerDaoImpl implements WorkerDao {
	private Worker worker;
	
	@Override
	public Worker selectWorker() {
		return this.worker;
	}
	
	@Override
	public void insertWorker(Worker worker) {
		this.worker = worker;
	}
	
	@Override
	public void updateWorker(String workerName) {
		this.worker.setWorkerName(workerName);
	}
	
	@Override
	public void deleteWorker() {
		this.worker = null;
	}
}

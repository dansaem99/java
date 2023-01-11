package root.service;

import root.dao.WorkerDao;
import root.domain.Worker;

public class WorkerServiceImpl implements WorkerService {
	public WorkerDao workerDao;
	
	public WorkerServiceImpl(WorkerDao workerDao) {
		this.workerDao = workerDao;
	}
	
	@Override
	public Worker getWorker() {
		return workerDao.selectWorker();
	}
	
	@Override
	public void addWorker(Worker worker) {
		workerDao.insertWorker(worker);
	}
	
	@Override
	public void fixWorker(String workerName) {
		workerDao.updateWorker(workerName);
	}
	
	@Override
	public void delWorker() {
		workerDao.deleteWorker();
	}
}

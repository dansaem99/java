package root.service;

import root.domain.Worker;

public interface WorkerService {
	public Worker getWorker();
	public void addWorker(Worker worker);
	public void fixWorker(String workerName);
	public void delWorker();
}

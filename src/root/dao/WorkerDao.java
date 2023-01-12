package root.dao;

import root.domain.Worker;

public interface WorkerDao {
	public Worker selectWorker(); //목록
	public void insertWorker(Worker worker); //추가
	public void updateWorker(String workerName); //수정
	public void deleteWorker(); //삭제
}

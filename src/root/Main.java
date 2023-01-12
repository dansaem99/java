package root;

import root.dao.WorkerDao;
import root.dao.WorkerDaoImpl;
import root.presentation.Console;
import root.presentation.WorkerIo;
import root.service.WorkerService;
import root.service.WorkerServiceImpl;

public class Main {
	public static void main(String[] args) {
		WorkerDao workerDao = new WorkerDaoImpl();
		WorkerService workerService = new WorkerServiceImpl(workerDao);
		WorkerIo workerIo = new WorkerIo(workerService);

		workerIo.play();
		Console.info("end.");
	}
}

package root.presentation;

import root.domain.Worker;
import root.service.WorkerService;

public class WorkerIo {
	private WorkerService workerSevice;;
	
	public WorkerIo(WorkerService workerService) {
		this.workerSevice = workerService;
	}
	
	public void play() {
		String menu = Console.inStr("1.목록 2.추가 3.수정 4.삭제 0.종료");
		workerSevice.addWorker(new Worker(menu));
		
		String menuChoice;
		if(menu == "1") menuChoice = "목록";
		else if(menu == "2") menuChoice = "추가";
		else if(menu == "3") menuChoice = "수정";
		else if(menu == "4") menuChoice = "삭제";
		else if(menu == "0") menuChoice = "end";
		
		Console.info(menuChoice + "을 선택했습니다.");
		
	}
}

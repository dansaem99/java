package ch06.ex06.case06;

import ch06.ex06.case04.Appliance;
import ch06.ex06.case05.Electronic;

public interface HomeAppliance extends Appliance, Electronic {
	/*extends 뒤에 클래스명을 넣으면 하나만쓸 수 있고
	뒤에 인터페이스 명을 넣으면 더 넣을 수 있다.*/
}

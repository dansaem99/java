package ch07.ex06.case05;

public class Main {
	public static void main(String[] args) {
		Cabinet<A> cabinet1 = new Cabinet<>();
		Cabinet<B> cabinet2 = new Cabinet<>();//B는 a와 부모 자식이다.
		//Cabinet<C> cabinet3 = new Cabinet<>(); A이하가 아니기 때문에
		
		A[] arr1 = {new A(), new A()};
		B[] arr2 = {new B(), new B()};
		C[] arr3 = {new C(), new C()};
		D[] arr4 = {new D(), new D()};
		
		cabinet1.getLastVal(arr1);
		cabinet2.getLastVal(arr2);
		//cabinet1.getLastVal(arr3);
		cabinet1.getLastVal(arr2);
		
		//cabinet1.getFinalVal(arr1);
		//cabinet1.getFinalVal(arr2);
		cabinet1.getFinalVal(arr3);
		cabinet1.getFinalVal(arr4);
	}
}

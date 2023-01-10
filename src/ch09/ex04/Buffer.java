package ch09.ex04;

public class Buffer {
	private Integer val;
	
	public synchronized int remove() {
		while(val == null) {
			try {
				wait();
			} catch
		}
	}
}

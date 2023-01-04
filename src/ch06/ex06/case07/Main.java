package ch06.ex06.case07;

public class Main {
	public static void main(String[] args) {
		int val = 1;
		
		switch(val) {
		case 1 -> val++;
		case 2 -> val++; 
		}
		
		switch(val) {
		case Code.USER_ADD -> val++;
		case Code.USER_DEL -> val++;
		}
	}
}

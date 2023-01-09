package ch07.ex06.case02;

public class Cosmos {
	public static Animal getAnimal(String animalName) {
		return switch(animalName) {
		case "호랑이" -> new Tiger();
		case "매" -> new Falcon();
		default -> null;
		};
	}
}

package ua.lviv.lgs.animal;

public class Aplication {
	public static void main(String[] args) {
		Animal a = new Animal("Леопард", 20, 7);
		System.out.println(a);
		a.setName("Бик");
		a.setAge(14);
		a.setSpeed(2);
		System.out.println(a);
	}
}

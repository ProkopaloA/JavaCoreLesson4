package ua.lviv.lgs.robots;

import java.util.ArrayList;

public class Aprlication {
	public static void main(String[] args) {
		Robot robot = new Robot("я Robot Ц € просто працюю.");

		CoffeRobot CR = new CoffeRobot("я CoffeRobot Ц € варю каву.");

		RobotDancer RD = new RobotDancer("я RobotDancer Ц € просто танцюю.");

		RobotCoocker RC = new RobotCoocker("я RobotCoocker Ц € просто готую.");

		ArrayList<Robot> robots = new ArrayList<>();
		robots.add(robot);
		robots.add(CR);
		robots.add(RD);
		robots.add(RC);
		for (int i = 0; i < robots.size(); i++) {
			System.out.println();
		}

	}
}

package ua.lviv.lgs.robots;

import java.util.ArrayList;

public class Aprlication {
	public static void main(String[] args) {
		Robot robot = new Robot("� Robot � � ������ ������.");

		CoffeRobot CR = new CoffeRobot("� CoffeRobot � � ���� ����.");

		RobotDancer RD = new RobotDancer("� RobotDancer � � ������ ������.");

		RobotCoocker RC = new RobotCoocker("� RobotCoocker � � ������ �����.");

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

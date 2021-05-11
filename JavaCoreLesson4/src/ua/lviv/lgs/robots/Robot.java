package ua.lviv.lgs.robots;

public class Robot {
	private String whatDoRobot;

	Robot(String whatDoRobot) {
		this.whatDoRobot = whatDoRobot;
		work();
	}

	public void work() {
		System.out.println(whatDoRobot);
	}
	public String getWhatDoRobot() {
		return whatDoRobot;
	}

}

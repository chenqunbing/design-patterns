package work3;

public class Yingzhang extends Officer {
	public Yingzhang(String name) {
		super(name);
	}
	@Override
	public void handleMission(Mission mission) {
		if (mission.getEnemyNumber() >= 50 && mission.getEnemyNumber() < 200) {
			System.out
					.println(name + "接到" + mission.getMission()
							+ "的军情" + ",敌人数量为" + mission.getEnemyNumber()
							+ ",可以下达作战指令");
		} else {
			System.out
					.println("接到" + mission.getMission() + "的军情" + ",敌人数量为"
							+ mission.getEnemyNumber() + ",敌人太多了，开会讨论！");
		}
	}
}
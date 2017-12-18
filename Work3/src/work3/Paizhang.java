package work3;

public class Paizhang extends Officer {
	public Paizhang(String name) {
		super(name);
	}
	@Override
	public void handleMission(Mission mission) {
		if (mission.getEnemyNumber() >= 10 && mission.getEnemyNumber() < 50) {
			System.out
					.println(name + "接到" + mission.getMission()
							+ "的军情" + ",敌人数量为" + mission.getEnemyNumber()
							+ ",可以下达作战指令");
		} else {
			if (this.successor != null) {
				this.successor.handleMission(mission);
			}
		}
	}
}

package work3;

public class Paizhang extends Officer {
	public Paizhang(String name) {
		super(name);
	}
	@Override
	public void handleMission(Mission mission) {
		if (mission.getEnemyNumber() >= 10 && mission.getEnemyNumber() < 50) {
			System.out
					.println(name + "�ӵ�" + mission.getMission()
							+ "�ľ���" + ",��������Ϊ" + mission.getEnemyNumber()
							+ ",�����´���սָ��");
		} else {
			if (this.successor != null) {
				this.successor.handleMission(mission);
			}
		}
	}
}

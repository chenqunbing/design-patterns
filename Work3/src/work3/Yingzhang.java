package work3;

public class Yingzhang extends Officer {
	public Yingzhang(String name) {
		super(name);
	}
	@Override
	public void handleMission(Mission mission) {
		if (mission.getEnemyNumber() >= 50 && mission.getEnemyNumber() < 200) {
			System.out
					.println(name + "�ӵ�" + mission.getMission()
							+ "�ľ���" + ",��������Ϊ" + mission.getEnemyNumber()
							+ ",�����´���սָ��");
		} else {
			System.out
					.println("�ӵ�" + mission.getMission() + "�ľ���" + ",��������Ϊ"
							+ mission.getEnemyNumber() + ",����̫���ˣ��������ۣ�");
		}
	}
}
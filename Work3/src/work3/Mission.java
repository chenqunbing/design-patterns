package work3;
public class Mission {
	private String mission; 
	private int enemyNumber; 
	public Mission() {
		super();
	}
	public Mission(String mission, int enemyNumber) {
		super();
		this.mission = mission;
		this.enemyNumber = enemyNumber;
	}
	public String getMission() {
		return mission;
	}
	public void setMission(String mission) {
		this.mission = mission;
	}
	public int getEnemyNumber() {
		return enemyNumber;
	}

	public void setEnemyNumber(int enemyNumber) {
		this.enemyNumber = enemyNumber;
	}
}

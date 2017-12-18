package work3;
public class Client {
	public static void main(String[] args) {
		Officer Bangzhang = new Banzhang("王班长");
		Officer Paizhang = new Paizhang("赵排长");
		Officer Yingzhang = new Yingzhang("王营");
		Bangzhang.setSuccessor(Paizhang);
		Paizhang.setSuccessor(Yingzhang);
		Mission m1 = new Mission("mission1", 3);
		Bangzhang.handleMission(m1);
		Mission m2 = new Mission("mission2", 38);
		Bangzhang.handleMission(m2);
		Mission m3 = new Mission("mission3", 100);
		Bangzhang.handleMission(m3);
		Mission m4 = new Mission("mission4", 400);
		Bangzhang.handleMission(m4);
	}
}
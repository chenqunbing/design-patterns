package work3;

public class Banzhang extends Officer{
    public Banzhang(String name) {
        super(name);
    }
    @Override
    public void handleMission(Mission mission) {
        if(mission.getEnemyNumber()>0 && mission.getEnemyNumber()<10){
            System.out.println(name+"�ӵ�"+mission.getMission()+"�ľ���"+",��������Ϊ"+mission.getEnemyNumber()+",�����´���սָ��");
        }else{
            if(this.successor!=null)
            {
                this.successor.handleMission(mission);
            }
        }
    }
}
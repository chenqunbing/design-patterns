package 外观模式案例;

public class Client {
	
	public static void main(String args[]){
		GeneralSwitchFacade gsf=new GeneralSwitchFacade();
		gsf.on();
		System.out.println("-----------------------------");
		gsf.off();
	}

}

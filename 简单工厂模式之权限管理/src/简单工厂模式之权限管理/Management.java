package 简单工厂模式之权限管理;

public class Management extends User{

	public Management(){
		System.out.println("创建经理对象！");
	}
	
	public void diffOperation(){
		System.out.println("经理拥有创建和审批假条的权利！");
	}
}

package 简单工厂模式之权限管理;

public class Administrator extends User{

	public Administrator(){
		System.out.println("创建管理者对象！");
	}
	public void diffOperation(){
		System.out.println("管理员拥有创建和管理假条的权利！");
	}
}

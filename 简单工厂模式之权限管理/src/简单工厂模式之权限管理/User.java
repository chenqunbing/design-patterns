package 简单工厂模式之权限管理;

public abstract class User {
	
	public void sameOperation(){
		System.out.println("修改个人信息！");
	}
	public abstract void diffOperation();

}

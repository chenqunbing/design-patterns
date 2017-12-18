package 简单工厂模式之权限管理;

public class UserDao {
	
	public int findPermission(String username,String password){
		if("zhangsan"==username&&"123456"==password){
			return 0;
		}else{
			return -1;
		}
	}
	
	

}

package �򵥹���ģʽ֮Ȩ�޹���;

public class UserDao {
	
	public int findPermission(String username,String password){
		if("zhangsan"==username&&"123456"==password){
			return 0;
		}else{
			return -1;
		}
	}
	
	

}

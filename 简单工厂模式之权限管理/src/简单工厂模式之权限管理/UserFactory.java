package �򵥹���ģʽ֮Ȩ�޹���;

public class UserFactory {
	
	public static User getUser(int permission){
		if(0==permission){
			return new Management();
		}else if(1==permission){
			return new Administrator();
		}else if(2==permission){
			return new Employee();
		}else{
			return null;
		}
	}

}

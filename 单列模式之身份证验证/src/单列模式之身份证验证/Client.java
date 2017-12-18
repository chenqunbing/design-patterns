package 单列模式之身份证验证;

public class Client {
	
	public static void main(String args[]){
		
		IdentityCardNo no1,no2;
		no1=IdentityCardNo.getInstance();
		no2=IdentityCardNo.getInstance();
		System.out.println("身份证号码是否一致？"+(no1==no2));
		
		String str1,str2;
		str1=no1.getIndentityCardNo();
		str2=no2.getIndentityCardNo();
		System.out.println("第一次号码："+str1);
		System.out.println("第二次号码："+str2);
		System.out.println("两次的号码内容是否一样？"+str1.equals(str2));
		System.out.println("两次是否指向同一个对象："+(str1==str2));
	}

}

package ����ģʽ֮���֤��֤;

public class Client {
	
	public static void main(String args[]){
		
		IdentityCardNo no1,no2;
		no1=IdentityCardNo.getInstance();
		no2=IdentityCardNo.getInstance();
		System.out.println("���֤�����Ƿ�һ�£�"+(no1==no2));
		
		String str1,str2;
		str1=no1.getIndentityCardNo();
		str2=no2.getIndentityCardNo();
		System.out.println("��һ�κ��룺"+str1);
		System.out.println("�ڶ��κ��룺"+str2);
		System.out.println("���εĺ��������Ƿ�һ����"+str1.equals(str2));
		System.out.println("�����Ƿ�ָ��ͬһ������"+(str1==str2));
	}

}

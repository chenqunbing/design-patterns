package ����ģʽ֮���֤��֤;

public class IdentityCardNo {
	
	private static IdentityCardNo instance=null;
	private String no;
	
	private IdentityCardNo(){
		
	}
	public static IdentityCardNo getInstance(){
		if(instance==null){
			System.out.println("��һ�ΰ������֤�������º��룺");
			instance=new IdentityCardNo();
			instance.setIndentityCardNo("No11111");
		}else{
			System.out.println("���°������֤����ȡ�ɺ���");
		}
		return instance;
	}
	
	public void setIndentityCardNo(String no){
		this.no=no;
	}
	public String getIndentityCardNo(){
		return this.no;
	}
	
	

}

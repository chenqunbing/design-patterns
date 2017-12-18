package 单列模式之身份证验证;

public class IdentityCardNo {
	
	private static IdentityCardNo instance=null;
	private String no;
	
	private IdentityCardNo(){
		
	}
	public static IdentityCardNo getInstance(){
		if(instance==null){
			System.out.println("第一次办理身份证，分配新号码：");
			instance=new IdentityCardNo();
			instance.setIndentityCardNo("No11111");
		}else{
			System.out.println("重新办理身份证，获取旧号码");
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

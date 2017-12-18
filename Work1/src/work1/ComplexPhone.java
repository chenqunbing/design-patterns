package work1;

public class ComplexPhone extends PhoneDecorator{
	
	public ComplexPhone(CellPhone phone) {
		super(phone);
		// TODO Auto-generated constructor stub
	}
	
	public void receiveCall(){
		super.receiveCall();
		System.out.println("µ∆π‚…¡À∏Ã· æ");
	}
}

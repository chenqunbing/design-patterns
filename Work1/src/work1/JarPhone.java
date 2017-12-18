package work1;

public class JarPhone extends PhoneDecorator {

	public JarPhone(CellPhone phone) {
		super(phone);
		// TODO Auto-generated constructor stub
	}
	
	public void receiveCall(){
		super.receiveCall();
		System.out.println("Õð¶¯ÌáÊ¾");
	}

}


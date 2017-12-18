package work1;

public class PhoneDecorator extends CellPhone {
	private CellPhone phone = null;	
	public PhoneDecorator(CellPhone phone)
	{
		if(phone != null)
		{
			this.phone = phone;
		}
		else
		{
			this.phone =new SimplePhone();
		}
	}
	@Override
	public void receiveCall()
	{
		// TODO Auto-generated method stub
		phone.receiveCall();
	}
}



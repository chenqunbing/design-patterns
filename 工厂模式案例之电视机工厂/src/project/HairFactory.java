package project;

public class HairFactory implements EFactory {
	
public Television produceTelevision(){
	
	return new HairTelevision();
}
	
	public AirConditioner produceAirConditioner(){
		
		return new HairAirConditioner();
	}

}

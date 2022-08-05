package inhertanceConcepts;

import org.omg.Messaging.SyncScopeHelper;

//---------------child-------------

public class bmw extends car{

	public void autoSuspension() {
		System.out.println("BMW----------auto air suspension");
	}
	@Override
	public void startCar() {
		System.out.println("BMW------------keyless start car");
		System.out.println("BMW--------------key start");
	}
}
	

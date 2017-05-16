package tiendm.pattern.observer;

public class HexaObserver extends Observer {
	
	public HexaObserver(Subject sub) {
		this.subject = sub;
		this.subject.attach(this);	
	}

	@Override
	public void update() {
		System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() ); 
		
	}

}

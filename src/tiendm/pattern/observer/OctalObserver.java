package tiendm.pattern.observer;

public class OctalObserver extends Observer {
	
	
	public OctalObserver(Subject sub) {
		this.subject = sub;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ).toUpperCase() ); 
		
	}

}

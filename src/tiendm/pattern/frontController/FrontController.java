package tiendm.pattern.frontController;

public class FrontController {
	private Dispatcher dispatcher;
	
	public FrontController() {
		this.dispatcher = new Dispatcher();
	}
	
	public boolean isAuthenticUser(){
		System.out.println("Check user");
		return true;
	}
	
	public void trackRequest(String request){
		System.out.println("Page request: " + request);
	}
	
	public void dispatchRequest(String request){
		trackRequest(request);
		if(isAuthenticUser()){
			dispatcher.dispatch(request);
		}
	}
	
	public Dispatcher getDispatcher() {
		return dispatcher;
	}

	public void setDispatcher(Dispatcher dispatcher) {
		this.dispatcher = dispatcher;
	}
	
}

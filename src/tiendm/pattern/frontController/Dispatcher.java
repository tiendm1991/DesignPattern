package tiendm.pattern.frontController;

public class Dispatcher {
	HomeView home = new HomeView();
	StudentView student = new StudentView();
	public Dispatcher() {
		this.home = new HomeView();
		this.student = new StudentView();
	}
	
	public void dispatch(String request){
		if(request.equalsIgnoreCase("student")){
			student.show();
		}else{
			home.show();
		}
	}
	
}

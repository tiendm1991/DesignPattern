package tiendm.pattern.intercepter;

public class AuthenticationFilter implements Filter {

	@Override
	public void excute(String request) {
		if(request.contains("TienDM")){
			System.out.println("Authenticating request: " + request + " --- login with TienDM");	
		}else {
			System.out.println("Authenticating request: " + request);	
		}
			
	}

}

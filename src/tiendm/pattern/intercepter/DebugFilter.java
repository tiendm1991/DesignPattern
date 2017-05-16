package tiendm.pattern.intercepter;

public class DebugFilter implements Filter {

	@Override
	public void excute(String request) {
		System.out.println("Debug log: " + request);
	}

}

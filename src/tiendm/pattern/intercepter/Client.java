package tiendm.pattern.intercepter;

public class Client {
	FilterManager filterManager;

	public FilterManager getFilterManager() {
		return filterManager;
	}

	public void setFilterManager(FilterManager filterManager) {
		this.filterManager = filterManager;
	}

	public void sendRequest(String request){
		filterManager.filterRequest(request);
	}
	
}

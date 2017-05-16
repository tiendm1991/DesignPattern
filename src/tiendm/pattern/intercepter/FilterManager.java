package tiendm.pattern.intercepter;

public class FilterManager {
	private FilterChain filterChain;
	

	public FilterManager(Target target) {
		filterChain = new FilterChain();
		filterChain.setTarget(target);
	}
	
	public void setFilter(Filter filter){
		filterChain.addFilter(filter);
	}
	
	public void filterRequest(String request){
		filterChain.excute(request);
	}

	public FilterChain getFilterChain() {
		return filterChain;
	}

	public void setFilterChain(FilterChain filterChain) {
		this.filterChain = filterChain;
	}
	
}	

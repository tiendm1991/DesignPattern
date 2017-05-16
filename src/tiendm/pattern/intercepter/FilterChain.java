package tiendm.pattern.intercepter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
	List<Filter> lsFilter;
	private Target target;

	public FilterChain() {
		lsFilter = new ArrayList<>();
	}
	
	public void addFilter(Filter filter){
		lsFilter.add(filter);
	}
	
	public void excute(String request){
		for(Filter filter: lsFilter){
			filter.excute(request);
		}
		target.excute(request);
	}
	
	public Target getTarget() {
		return target;
	}

	public void setTarget(Target target) {
		this.target = target;
	}
	
	
}

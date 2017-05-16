package tiendm.pattern.filter;

import java.util.List;

public class OrCriteria implements Criteria {
	
	private Criteria firstCriteria;
	private Criteria secondCriteria;
	
	public OrCriteria(Criteria firstCriteria, Criteria secondCriteria) {
		this.firstCriteria = firstCriteria;
		this.secondCriteria = secondCriteria;
	}
	public Criteria getFirstCriteria() {
		return firstCriteria;
	}

	public void setFirstCriteria(Criteria firstCriteria) {
		this.firstCriteria = firstCriteria;
	}

	public Criteria getSecondCriteria() {
		return secondCriteria;
	}

	public void setSecondCriteria(Criteria secondCriteria) {
		this.secondCriteria = secondCriteria;
	}
	
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> ls1 = firstCriteria.meetCriteria(persons);
		List<Person> ls2 = secondCriteria.meetCriteria(persons);
		for(Person p : ls2){
			if(!ls1.contains(p)) ls1.add(p);
		}
		return ls1;
	}

}

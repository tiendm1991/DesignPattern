package tiendm.pattern.filter;

import java.util.ArrayList;
import java.util.List;

public class Married implements Criteria{

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> lsReturn = new ArrayList<>();
		for(Person person : persons){
			if(person.getMaritalStatus() == MaritalStatus.MARRIED){
				lsReturn.add(person);
			}
		}
		return lsReturn;
	}

}

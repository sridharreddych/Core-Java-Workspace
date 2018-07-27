package com.sree.filterorcriteria;

import java.util.ArrayList;
import java.util.List;

/* Step 3 Create concrete classes implementing the Criteria interface. */
public class CriteriaSingle implements Criteria {
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singlePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
				singlePersons.add(person);
			}
		}
		return singlePersons;
	}
}
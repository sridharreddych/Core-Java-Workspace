package com.sree.filterorcriteria;

import java.util.ArrayList;
import java.util.List;

/* Step 3 Create concrete classes implementing the Criteria interface. */
public class CriteriaFemale implements Criteria {
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> femalePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getGender().equalsIgnoreCase("FEMALE")) {
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}
}
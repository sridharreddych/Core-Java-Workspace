package com.sree.filterorcriteria;

import java.util.ArrayList;
import java.util.List;

/* Step 3 Create concrete classes implementing the Criteria interface. */
public class CriteriaMale implements Criteria {
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getGender().equalsIgnoreCase("MALE")) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}
}
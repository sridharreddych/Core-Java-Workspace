package com.sree.filterorcriteria;

import java.util.List;

/*Step 2 Create an interface for Criteria. */
public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}
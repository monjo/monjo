package org.monjo.example;

import org.monjo.core.annotations.Entity;
import org.monjo.core.annotations.Id;
import org.monjo.document.IdentifiableDocument;

@Entity
public class IntegerId implements IdentifiableDocument<Integer> {

	private Integer id;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Id
	public Integer getId() {
		return id;
	}

	@Id
	public void setId(Integer id) {
		this.id = id;
	}

}

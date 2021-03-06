package org.monjo.example;

import org.bson.types.ObjectId;
import org.monjo.core.annotations.Entity;
import org.monjo.core.annotations.Id;
import org.monjo.core.annotations.Transient;

@Entity
public class Example  {
	
	private ObjectId id;
	private String name;
	private Integer number;
		
	private Long someValue;
	
	public Example() {
		someValue = 2l;
	}
	
	public Example(String name, Integer number) {
		this.name = name;
		this.number = number;
		someValue = 3l;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public void setSomeValue(Long someValue) {
		this.someValue = someValue;
	}

	@Id
	public ObjectId getId() {
		return id;
	}
	
	@Id
	public void setId(ObjectId id) {
		this.id = id;
		
	}
	public String getName() {
		return name;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	@Transient
	public Long getSomeValue() {
		return someValue;
	}
	
	@Override
	public String toString() {
		return "Example ["
				+ "id:" + id
				+ ", name:" + name
				+ ", number:" + number
				+ ", someValue:" + someValue
				+ "]";
	}

}

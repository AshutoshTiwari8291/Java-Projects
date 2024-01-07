package com.example.restfulwebservicesj17.versioning;

public class PersonV2 {
	public PersonV2(Name name) {
		super();
		this.name = name;
	}

	private Name name;

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PersonV2 [name=" + name + "]";
	}
}

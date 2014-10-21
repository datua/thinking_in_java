package com.wzj.thinkinginjava.typeinfo;

public class Position {
	private String title;
	private Person person;
	public Position(String title, Person person) {
		this.title = title;
		if (person == null) {
			person = Person.NULL;
		} else {
			this.person = person;
		}
	}
	public Position(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
		if (person == null) {
			this.person = Person.NULL;
		}
	}

	public String toString() {
		return "Position [title=" + title + ", person=" + person + "]";
	}
}

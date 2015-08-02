package ac.nz.unitec.model;

import java.util.HashSet;
import java.util.Set;

public class User {
	private int id;
	private String name;
	private Set<Email> emails = new HashSet<Email>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Email> getEmails() {
		return emails;
	}

	public void setEmails(Set<Email> emails) {
		this.emails = emails;
	}

}

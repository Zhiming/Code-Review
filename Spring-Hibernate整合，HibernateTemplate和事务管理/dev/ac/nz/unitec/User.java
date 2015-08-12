package ac.nz.unitec;

import java.sql.Timestamp;

public class User {
	private int id;
	private String name;
	private Timestamp dt;

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

	public Timestamp getDt() {
		return dt;
	}

	public void setDt(Timestamp dt) {
		this.dt = dt;
	}

}

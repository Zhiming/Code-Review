package ac.nz.unitec;

import java.sql.Timestamp;

public class Log {
	private int id;
	private String msg;
	private Timestamp dt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Timestamp getDt() {
		return dt;
	}

	public void setDt(Timestamp dt) {
		this.dt = dt;
	}

}

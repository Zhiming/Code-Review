package ac.nz.unitec;

public class Service {

	private Dao dao;

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	public void add(User user) {
		dao.save(user);
	}
}

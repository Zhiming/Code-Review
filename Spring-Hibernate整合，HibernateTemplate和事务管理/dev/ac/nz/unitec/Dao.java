package ac.nz.unitec;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class Dao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void save(User user) {
		hibernateTemplate.save(user);
		Log log = new Log();
		log.setMsg("user saved");
		log.setDt(new Timestamp(new Date().getTime()));
		hibernateTemplate.save(log);
	}
}

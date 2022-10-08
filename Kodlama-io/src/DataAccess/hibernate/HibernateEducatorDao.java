package DataAccess.hibernate;

import DataAccess.EducatorDao;
import Entities.Educator;

public class HibernateEducatorDao implements EducatorDao {

	@Override
	public void add(Educator educator) {
		String fullName = educator.getFirstName() + " " + educator.getLastName();
		System.out.println(fullName + " adlý eðitmen Hibernate ile veritabanýna eklendi");
		
	}

	@Override
	public void delete(int instructorId) {
		System.out.println(instructorId + " idi'li eðitmen Hibernate ile veritabanýndan silindi");
		
	}

}

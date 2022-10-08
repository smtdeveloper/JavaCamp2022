package DataAccess.hibernate;

import DataAccess.EducatorDao;
import Entities.Educator;

public class HibernateEducatorDao implements EducatorDao {

	@Override
	public void add(Educator educator) {
		String fullName = educator.getFirstName() + " " + educator.getLastName();
		System.out.println(fullName + " adl� e�itmen Hibernate ile veritaban�na eklendi");
		
	}

	@Override
	public void delete(int instructorId) {
		System.out.println(instructorId + " idi'li e�itmen Hibernate ile veritaban�ndan silindi");
		
	}

}

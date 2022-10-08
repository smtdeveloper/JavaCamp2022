package DataAccess.jdbc;

import DataAccess.EducatorDao;
import Entities.Educator;

public class JdbcEducatorDao implements EducatorDao {

	@Override
	public void add(Educator educator) {
		
			String fullName = educator.getFirstName() + " " + educator.getLastName();
			System.out.println(fullName + " adl� e�itmen JDBC ile veritaban�na eklendi");
	}

	@Override
	public void delete(int instructorId) {
		 System.out.println(instructorId + " idi'li e�itmen JDBC ile veritaban�ndan silindi");
		
	}

}

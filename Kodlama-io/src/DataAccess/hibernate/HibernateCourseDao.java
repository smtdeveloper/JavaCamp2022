package DataAccess.hibernate;

import DataAccess.CourseDao;
import Entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		 System.out.println(course.getName() + " kursu JDBC ile veritaban�na eklendi.");
		
	}

	@Override
	public void delete(int courseId) {
		 System.out.println(courseId + "id'li kursu JDBC ile veritaban�ndan silindi.");
		
	}

}

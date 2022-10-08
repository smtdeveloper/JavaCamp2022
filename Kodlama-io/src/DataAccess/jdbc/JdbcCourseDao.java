package DataAccess.jdbc;

import DataAccess.CourseDao;
import Entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		 System.out.println(course.getName() + " kursu JDBC ile veritabanưna eklendi.");
		
	}

	@Override
	public void delete(int courseId) {
		 System.out.println(courseId + "id'li kursu JDBC ile veritabanưndan silindi.");
		
	}

}

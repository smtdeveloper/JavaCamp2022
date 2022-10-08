package DataAccess;

import Entities.Category;
import Entities.Course;

public interface CourseDao {
	  void add(Course course);
	    void delete(int courseId);
	    
}

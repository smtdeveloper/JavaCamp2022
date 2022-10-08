package Business;

import Core.Loglama.Logger;
import DataAccess.CourseDao;
import Entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void CourseAdd(Course course) throws Exception 
	{
		if(course.getPrice() < 10 ) {
			throw new Exception("ürün fiyatý 10'dan kücük olamaz ! ");
		}
		
		courseDao.add(course);
		
		 for (Logger logger : loggers) {
             logger.log(course.getName() + " isimli kategori eklendi");
         }
		
	}
	
	public void CourseDelete(int courseId) 
	{
		courseDao.delete(courseId);
	}
	
	
}

import Business.CategoryManager;
import Business.CourseManager;
import Business.EducatorManager;
import DataAccess.CategoryDao;
import DataAccess.EducatorDao;
import DataAccess.hibernate.HibernateCategoryDao;
import DataAccess.hibernate.HibernateCourseDao;
import DataAccess.hibernate.HibernateEducatorDao;
import Entities.Category;
import Entities.Course;
import Entities.Educator;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Category category1 = new Category(1,"C#", "ac�klama alan�");
		Category category2 = new Category(2,"JAVA", "ac�klama alan�");
		Category category3 = new Category(3,"PHP", "ac�klama alan�");
		
		Course course1 = new Course(1, "c# kamp�","Engin Demirog " , 50 , 1);
		Course course2 = new Course(1, "JAVA kamp�","Engin Demirog " , 25 , 2);
		Course course3 = new Course(1, "PHP kamp�","Murat Y�cedag " , 10 , 3);
		
		Educator educator1 = new Educator(1, "Engin Demirog", "img.png");
		Educator educator2 = new Educator(2, "Murat Y�cedag", "img.png");
		
		
		Core.Loglama.Logger[] loggers = {  new Core.Loglama.FileLogger() , new Core.Loglama.MailLogger() };
		
		
		CategoryManager categoryManager = new  CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.CategoryAdd(category1);
		categoryManager.CategoryAdd(category2);
		categoryManager.CategoryAdd(category3);
		categoryManager.CategoryDelete(3);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao() , loggers);
		courseManager.CourseAdd(course1);
		courseManager.CourseAdd(course2);
		courseManager.CourseAdd(course3);
		categoryManager.CategoryDelete(3);
		
		EducatorManager educatorManager = new EducatorManager(new HibernateEducatorDao(), loggers);
		educatorManager.EducatorAdd(educator1);
		educatorManager.EducatorAdd(educator2);
		educatorManager.EducatorDelete(2);
		
		
		
		
		
		
		
	}

}

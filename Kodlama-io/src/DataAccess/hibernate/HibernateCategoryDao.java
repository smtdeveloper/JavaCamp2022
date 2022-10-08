package DataAccess.hibernate;

import DataAccess.CategoryDao;
import Entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		  System.out.println(category.getName() + " kategorisi Hibernate ile veritaban�na eklendi");
	}

	@Override
	public void delete(int categoryId) {
		 System.out.println( categoryId + "id'li kategorisi Hibernate ile veritaban�ndan silindi");
		
	}

	

}

package DataAccess.jdbc;

import DataAccess.CategoryDao;
import Entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		
        System.out.println(category.getName() + " kategorisi JDBC ile veritabanýna eklendi");
	}

	@Override
	public void delete(int categoryId) {
		 System.out.println( categoryId + "id'li kategorisi JDBC ile veritabanýndan silindi");
		
	}

	
}

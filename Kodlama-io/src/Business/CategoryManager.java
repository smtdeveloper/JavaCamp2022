package Business;

import Core.Loglama.Logger;
import DataAccess.CategoryDao;
import Entities.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void CategoryAdd(Category  category  ) 
	{
		categoryDao.add(category);

            for (Logger logger : loggers) {
                logger.log(category.getName() + " isimli kategori eklendi");
            }
        
		
	}
	
	public void CategoryDelete(int  categoryId) 
	{
		categoryDao.delete(categoryId);

            for (Logger logger : loggers) {
                logger.log(categoryId + " isimli kategori eklendi");
            }
        
		
	}
	
	
	
	
}

package DataAccess;

import Entities.Category;

public interface CategoryDao {

	void add(Category category);
    void delete(int categoryId);
    
    
}

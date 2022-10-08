package Business;

import Core.Loglama.Logger;
import DataAccess.EducatorDao;
import Entities.Educator;

public class EducatorManager {

	private EducatorDao educatorDao;
	private Logger[] loggers;
	
	
	public EducatorManager(EducatorDao educatorDao, Logger[] loggers) {
		this.educatorDao = educatorDao;
		this.loggers = loggers;
	}
	
	public void EducatorAdd(Educator educator ) 
	{
		educatorDao.add(educator);
		
		for (Logger logger : loggers) {
            logger.log(educator.getFirstName() + " " + educator.getPhotoUrl() +" isimli eðitmen eklendi");
        }
		
	}
	
	public void EducatorDelete(int educatorId)
	{
		educatorDao.delete(educatorId);
		
	}
	
	
	
	
}

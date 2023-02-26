package abstractFactoryPattern.daoFactory;

import abstractFactoryPattern.productDao.ProductDao;
import abstractFactoryPattern.userInfoDao.UserInfoDao;

public abstract class DaoFactory {
	public abstract UserInfoDao createUserInfoDao();
	public abstract ProductDao createProductDao();
}

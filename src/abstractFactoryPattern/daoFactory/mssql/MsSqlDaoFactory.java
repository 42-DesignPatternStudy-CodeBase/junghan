package abstractFactoryPattern.daoFactory.mssql;

import abstractFactoryPattern.daoFactory.DaoFactory;
import abstractFactoryPattern.productDao.ProductDao;
import abstractFactoryPattern.productDao.mssql.ProductMsSqlDao;
import abstractFactoryPattern.userInfoDao.UserInfoDao;
import abstractFactoryPattern.userInfoDao.mssql.UserInfoMssqlDao;


public class MsSqlDaoFactory extends DaoFactory {
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoMssqlDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductMsSqlDao();
    }
}
package abstractFactoryPattern.daoFactory.mysql;

import abstractFactoryPattern.daoFactory.DaoFactory;
import abstractFactoryPattern.productDao.ProductDao;
import abstractFactoryPattern.productDao.mysql.ProductMySqlDao;
import abstractFactoryPattern.userInfoDao.UserInfoDao;
import abstractFactoryPattern.userInfoDao.mysql.UserInfoMysqlDao;

public class MySqlDaoFactory extends DaoFactory {
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoMysqlDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductMySqlDao();
    }
}
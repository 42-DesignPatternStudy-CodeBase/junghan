package abstractFactoryPattern.daoFactory.oracle;

import abstractFactoryPattern.daoFactory.DaoFactory;
import abstractFactoryPattern.productDao.ProductDao;
import abstractFactoryPattern.productDao.oracle.ProductOracleDao;
import abstractFactoryPattern.userInfoDao.UserInfoDao;
import abstractFactoryPattern.userInfoDao.oracle.UserInfoOracleDao;

public class OracleDaoFactory extends DaoFactory {
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoOracleDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductOracleDao();
    }
}
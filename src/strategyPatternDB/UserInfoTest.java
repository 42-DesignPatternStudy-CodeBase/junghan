package strategyPatternDB;

import strategyPatternDB.dao.UserInfoDao;
import strategyPatternDB.dao.mssqlDao.UserInfoMssqlDao;
import strategyPatternDB.dao.oracleDao.UserInfoOracleDao;

public class UserInfoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInfoWeb web = new UserInfoWeb();
		UserInfoDao mssql = new UserInfoMssqlDao();
		UserInfoDao oracle = new UserInfoOracleDao();
		
		web.insertData("userId", "land123");
		web.insertData("userId", "mountain123");
		web.insertData("userId", "river123");
		
		web.changeDao(mssql);
		web.updateData("passwd", "adsf");
		web.updateData("passwd", "1212312");
		web.updateData("passwd", "1faafd");
		
		web.changeDao(oracle);
		web.deleteData("userName", "land123");
		web.deleteData("passwd", "mountain123");
		web.deleteData("userId", "river123");
	}

}

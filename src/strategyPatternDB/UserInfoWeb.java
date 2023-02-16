package strategyPatternDB;

import strategyPatternDB.dao.UserInfoDao;
import strategyPatternDB.dao.mssqlDao.UserInfoMssqlDao;
import strategyPatternDB.dao.mysqlDao.UserInfoMysqlDao;
import strategyPatternDB.dao.oracleDao.UserInfoOracleDao;

public class UserInfoWeb {

	
	UserInfoDao DBTYPE = new UserInfoMysqlDao();

	public void changeDao(String dbType) {
		if (dbType.equals("ORACLE")) {
			DBTYPE = new UserInfoOracleDao(); // 만약 dbType이 ORACLE이면 new UserInfoOracleDao() 하고,
		} else if (dbType.equals("MYSQL")) {
			DBTYPE = new UserInfoMysqlDao(); // 또는 dbType이 MYSQL이면 new UserInfoMySqlDao() 하고,
		} else if (dbType.equals("MSSQL")){
			DBTYPE = new UserInfoMssqlDao();
		}
		else
			System.out.println("db error"); // 2개만 지원하는 프로그램으로 둘중에 하나도 아니라면 에러표시
			return;
	}
	
	public void insertData(String cell, String content) {
		DBTYPE.insertData(cell, content);
	}
	
	public void updateData(String cell, String content) {
		DBTYPE.updateData(cell, content);
	}
	
	public void deleteData(String cell, String content) {
		DBTYPE.deleteData(cell, content);
	}
}

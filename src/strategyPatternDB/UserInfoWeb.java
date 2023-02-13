package strategyPatternDB;

import strategyPatternDB.dao.UserInfoDao;
import strategyPatternDB.dao.mysqlDao.UserInfoMysqlDao;

public class UserInfoWeb {
	
	UserInfo user = new UserInfo("sky123", "123!", "James");
	
	UserInfoDao DBTYPE = new UserInfoMysqlDao();
	
	public void changeDao(UserInfoDao dao) {
		this.DBTYPE = dao;
	}
	
	public void insertData(String cell, String content) {
		System.out.print("insert into ");
		this.DBTYPE.callDao();
		if (cell.equals("userName"))
			user.setUserName(content);
		else if (cell.equals("userId")) 
			user.setUserId(content);
		else if (cell.equals("passwd"))
			user.setPasswd(content);
		else
			System.out.println("DB error ");
		System.out.println("DB " + cell + " = " + content);
	}
	
	public void updateData(String cell, String content) {
		System.out.print("update into ");
		this.DBTYPE.callDao();
		if (cell.equals("userName"))
			user.setUserName(content);
		else if (cell.equals("userId")) 
			user.setUserId(content);
		else if (cell.equals("passwd"))
			user.setPasswd(content);
		else
			System.out.println("DB error ");
		System.out.println("DB " + cell + " = " + content);
	}
	
	public void deleteData(String cell, String content) {
		System.out.print("delete into ");
		this.DBTYPE.callDao();
		if (cell.equals("userName"))
			System.out.println("DB " + cell + " = " + user.getUserName());
		else if (cell.equals("userId")) 
			System.out.println("DB " + cell + " = " + user.getUserId());
		else if (cell.equals("passwd"))
			System.out.println("DB " + cell + " = " + user.getPasswd());
		else
			System.out.println("DB error ");
	}
}

package strategyPatternDB.dao.mssqlDao;

import strategyPatternDB.dao.UserInfoDao;

public class UserInfoMssqlDao implements UserInfoDao {
	String type = "MSSQL";

	@Override
	public void insertData(String cell, String content) {
		System.out.print("insert into " + type);
		if (cell.equals("userName"))
			user.setUserName(content);
		else if (cell.equals("userId")) 
			user.setUserId(content);
		else if (cell.equals("passwd"))
			user.setPasswd(content);
		else
			System.out.println("DB error ");
		System.out.println(" DB " + cell + " = " + content);
	}
	
	@Override
	public void updateData(String cell, String content) {
		System.out.print("update into " + type);
		if (cell.equals("userName"))
			user.setUserName(content);
		else if (cell.equals("userId")) 
			user.setUserId(content);
		else if (cell.equals("passwd"))
			user.setPasswd(content);
		else
			System.out.println("DB error ");
		System.out.println(" DB " + cell + " = " + content);
	}
	
	@Override
	public void deleteData(String cell, String content) {
		System.out.print("delete into " + type);
		if (cell.equals("userName"))
			System.out.println(" DB " + cell + " = " + user.getUserName());
		else if (cell.equals("userId")) 
			System.out.println(" DB " + cell + " = " + user.getUserId());
		else if (cell.equals("passwd"))
			System.out.println(" DB " + cell + " = " + user.getPasswd());
		else
			System.out.println("DB error ");
	}

}

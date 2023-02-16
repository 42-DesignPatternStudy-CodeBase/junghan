package strategyPatternDB.dao;

import strategyPatternDB.UserInfo;

public interface UserInfoDao {
	UserInfo user = new UserInfo("sky123", "123!", "James");

	public void insertData(String cell, String content);
	
	public void updateData(String cell, String content);
	
	public void deleteData(String cell, String content);
}

package abstractFactoryPattern.userInfoDao.oracle;

import java.util.ArrayList;

import abstractFactoryPattern.UserInfo;
import abstractFactoryPattern.userInfoDao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
	ArrayList<UserInfo> list = new ArrayList<>();

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		UserInfo newUserInfo = new UserInfo();

		newUserInfo.setUserName(userInfo.getUserName());
		newUserInfo.setUserId(userInfo.getUserName());
		newUserInfo.setPasswd(userInfo.getPasswd());

		list.add(newUserInfo);
		System.out.println("==User Oracle insertUserInfo==");

	}
	
	@Override
	public void updateUserInfo(UserInfo userInfo) {
		for (UserInfo user: list) {
			if (user.getUserId().equals(userInfo.getUserId())) {
				user.setUserName(userInfo.getUserName());
				user.setPasswd(userInfo.getPasswd());
			}
		}
		System.out.println("==User Oracle updateUserInfo==");

	}
	
	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		for (UserInfo user: list) {
			if (user.getUserId().equals(userInfo.getUserId())) {
				list.remove(user);
				break;
			}
		}
		System.out.println("==User Oracle deleteUserInfo==");

	}
}

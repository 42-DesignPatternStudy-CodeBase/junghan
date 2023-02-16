package strategyPatternDB;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		UserInfoWeb web = new UserInfoWeb();

		
		FileInputStream fis = new FileInputStream("/Users/junghan/Desktop/programming/JAVA_LAB/java_design_pattern/src/strategyPatternDB/db.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		fis.close();
		
		web.changeDao(dbType);
		
		web.insertData("userId", "land123");
		web.insertData("userId", "mountain123");
		web.insertData("userId", "river123");
		
		web.updateData("passwd", "adsf");
		web.updateData("passwd", "1212312");
		web.updateData("passwd", "1faafd");
		
		web.deleteData("userName", "land123");
		web.deleteData("passwd", "mountain123");
		web.deleteData("userId", "river123");
	}

}


public class DBUtil {
	private String dbName;
	
	public DBUtil(String dbName) {
		this.dbName = dbName;
		getConnection(dbName);
	}
	
	public void getConnection(String dbName) {
		System.out.println("���ݿ�: " + dbName +  "  ������");
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	
	
}


public class UserDAO {
	private DBUtil dbu;
	
	public UserDAO(DBUtil dbu) {
		this.dbu=dbu;
	}
	
	public boolean findUser(String userName,String userPasswd) {
		if(userName == "" || userName==null)
		{
			System.out.println("�û���������");
			return false;
		}
		
//		�˴�A��B Ϊ���ݿ���ҵ����û�������
		if(userName=="A" && userPasswd=="B") {
			System.out.println("�û�������ƥ��");
			return true;
		}
		else {
			System.out.println("�û������������");
			return false;
		}
	}
}


public class LoginForm {
	private UserDAO dao;
	private	String userName;
	private String userPasswd;
	
	public LoginForm(UserDAO dao) {
		// TODO Auto-generated constructor stub
		this.dao = dao;
		init();
		display();
	}
	
	public void init() {
		System.out.println("��ʼ����¼�ؼ��ɹ�");
	}
	
	public void display() {
		System.out.println("�ɹ����ӿؼ�����ʾ");
	}
	
	public void validate() {
		if(this.dao.findUser(userName, userPasswd)) {
			System.out.println("�û��ɹ���¼");
		}
		else {
			System.out.println("�û���¼ʧ��");
		}
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPasswd() {
		return userPasswd;
	}

	public void setUserPasswd(String userPasswd) {
		this.userPasswd = userPasswd;
	}
	
}

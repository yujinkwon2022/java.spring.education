package user;

public class UserOracleDao implements UserDao{
	
	public void getUser(String id) {
		System.out.println("����Ŭ���� ���̵� " + id +"�� ��� ���� ��ȸ");
	}
	
	public void getAllUser(String position) {
		System.out.println("����Ŭ���� ����� ���� ��ȸ");
	}

}

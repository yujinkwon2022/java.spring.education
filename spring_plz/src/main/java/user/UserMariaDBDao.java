package user;

public class UserMariaDBDao implements UserDao{
	
	public void getUser(String id) {
		System.out.println("������ ��񿡼� ���̵� "+ id +" ���� ��ȸ");
	}
	
	public void getAllUser(String position) {
		System.out.println("������ ��񿡼� �� ��� ���� ��ȸ");
	}
}

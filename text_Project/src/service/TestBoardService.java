package service;

import dao.TestBoardDAO;

public class TestBoardService {
	private static TestBoardService instance = null;
	private TestBoardService() {}
	public static TestBoardService getInstance() {
		if(instance == null) instance = new TestBoardService();
		return instance;
	}
	
	TestBoardDAO dao = TestBoardDAO.getInstance();
	
	public int list(){
		// �����ڸ� ��� ����� ����
		// ����������� ���� �ۼ��� �Խñۿ� ���ؼ��� ����, ������ ����
		
		// �Խ��� ��ü ����Ʈ�� ��������
		// 1. ��� 2. ���� 3. ����
		
		return 0;
	}
}

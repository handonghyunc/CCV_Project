package service;

import java.util.Map;

import controller.Controller;
import dao.LoginDAO;
import util.ScanUtil;
import util.View;

public class LoginService {
	// �̱��� ������ �����.
	private static LoginService instance = null;
	private LoginService() {}
	public static LoginService getInstance() {
		if(instance == null) 
			instance = new LoginService();
		return instance;
	}
	
	public static int loginCount = 0;
	
	// Dao�� �θ���
	LoginDAO dao = LoginDAO.getInstance();
	int pageNo = 0;
	
	public int login(){
		System.out.println("���̵� �Է�>>> ");
		String id = ScanUtil.nextLine();
		System.out.println("��й�ȣ �Է�>>> ");
		String pass = ScanUtil.nextLine();
		
		Map<String, Object> result = dao.login(id,pass);
		
		if(result != null && result.get("USER_ID").equals(id)){
//			Controller.sessionStorage.put("login", true);
//			Controller.sessionStorage.put("loginInfo", result);
			System.out.println(result.get("USER_ID") + "��! �α��� �Ǿ����ϴ�");
			pageNo = View.TEST_LIST;
		}else{
			System.out.println("�ٽ� �α������ּ���!");
			pageNo = View.HOME;
		}
		return pageNo;
	}
}

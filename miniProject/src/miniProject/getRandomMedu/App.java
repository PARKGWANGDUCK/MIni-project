package miniProject.getRandomMedu;

import java.util.Scanner;

import miniProject.controller.Controller;
import miniProject.dao.UserDAO;
import miniProject.methods.User;

public class App {

	public static void main(String[] args) {
		
		// table 생성
//		DBUtils.dropAndCreateUserTable(); 
		
		Controller todoController = new Controller();
		UserDAO userDAO = new UserDAO();
		User user = new User();
		User logUser = new User();
		Scanner z = new Scanner(System.in);
		
			while (true) {
				System.out.println("1.회원가입 2.로그인 3.메뉴 추천");
				int choice = z.nextInt();
				
				// 회원가입하기
				if (choice == 1) {
					System.out.println("아이디 입력 : ");
					String id = z.next();
					user.setUser_id(id);;

					System.out.println("비밀번호 입력 : ");
					String pw = z.next();
					
					System.out.println("비밀번호 재확인 : ");
					String pw2 = z.next();
					if (pw == pw2) {
						System.out.println(id + "님 회원가입을 환영합니다.");
					}
					user.setUser_password(pw);
					userDAO.insertUser(user);
						
				} 
				
				// 로그인하기
				if (choice == 2) {
					// 아이디 비번 입력받기
					int i = 0; // for문 밖에서도 사용할 변수
						for (i = 0; i < 3; i++) {
							try {
								System.out.println("아이디 입력 : ");
								String id = z.next();
								System.out.println("비밀번호 입력 : ");
								String pw = z.next();
								logUser = userDAO.findUser(id);
								if (id.equals(logUser.getUser_id()) && pw.equals(logUser.getUser_password())) { // equals() 문자열 비교
									System.out.println(id + "님 로그인 성공했습니다.");
									todoController.findMenu();
									break;
								} else {
									System.out.println("비밀번호가 일치하지 않습니다.");
							    }
							} catch(NullPointerException e) {
								System.out.println("아이디가 틀렸습니다.");
							}
						}
					if (i == 3) {
						System.out.println("로그인에 실패하셨습니다.");
					}
				}
				z.close();
				
				// 메뉴 추천받기
//				if (choice == 3) {
//					break;
//				}
			}
	}
}

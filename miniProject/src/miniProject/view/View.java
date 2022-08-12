package miniProject.view;

import miniProject.methods.Menu;

public class View {
	
	public void findMenu(Menu todo) {
		System.out.println("오늘의 추천 메뉴는 " + todo.getFood_type() + " 중에서 " + todo.getFood_name() + "입니다.");
	}
	
	public void succesPage() {
		System.out.println("정상 등록 되었습니다.");
	}
	
	public void errorPage(Exception error) {
		System.out.println("문제가 발생하였습니다." + error.getMessage());
	}
}
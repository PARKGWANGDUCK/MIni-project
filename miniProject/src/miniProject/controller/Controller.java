package miniProject.controller;

import miniProject.dao.MenuDAO;
import miniProject.dao.UserDAO;
import miniProject.methods.Menu;
import miniProject.methods.User;
import miniProject.view.View;

public class Controller {
	
	
	private final View todoView = new View();
	private final MenuDAO todoDAO;
	private final UserDAO userDAO = new UserDAO();
	   
	public Controller() {
	    todoDAO = new MenuDAO();
	}
	   
	public void findMenu() {
	    Menu todo = todoDAO.findMenu();
	    todoView.findMenu(todo);
	}

	public User findUser(String user_id) {
		User user = userDAO.findUser(user_id);
		return user;
	}

}

//	private final TodoView todoView = new TodoView();
//	private final TodoDAO todoDAO = new TodoDAO();
//  private final TodoService todoService = new TodoService();
//	
//	// 실제 로직 처리하는 service
//	private Exception errorObject;
//	
//	public TodoController() {
//		
//	}
//	
//	public void findMenu() {
//		Todo todo = todoService.findMenu();
//		todoView.findMenu(todo);
//	}	
//	public User findUser(String user_id) {
//		User user = userDAO.findUser(user_id);
//		return user;
//	}
//	
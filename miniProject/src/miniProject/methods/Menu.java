package miniProject.methods;

public class Menu {

	private int food_id; // 메뉴에 할당된 id
	private String food_type; // 한식 중식 일식 등
	private String food_name; // 메뉴명
	private boolean food_noodle;
	private boolean food_rice;
	private boolean food_stew;
	
	// 생성자
	public Menu() {
		super();
	}
	
	public Menu(String food_type, String food_name) {
		super();
		this.food_type = food_type;
		this.food_name = food_name;
	}


	public Menu(int food_id, String food_type, String food_name, boolean food_noodle, boolean food_rice,
			boolean food_stew) {
		super();
		this.food_id = food_id;
		this.food_type = food_type;
		this.food_name = food_name;
		this.food_noodle = food_noodle;
		this.food_rice = food_rice;
		this.food_stew = food_stew;
	}

	// get 메서드
	public int getFood_id() {
		return food_id;
	}

	public void setFood_id(int food_id) {
		this.food_id = food_id;
	}

	public String getFood_type() {
		return food_type;
	}

	public void setFood_type(String food_type) {
		this.food_type = food_type;
	}

	public String getFood_name() {
		return food_name;
	}

	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}

	public boolean isFood_noodle() {
		return food_noodle;
	}

	public void setFood_noodle(boolean food_noodle) {
		this.food_noodle = food_noodle;
	}

	public boolean isFood_rice() {
		return food_rice;
	}

	public void setFood_rice(boolean food_rice) {
		this.food_rice = food_rice;
	}

	public boolean isFood_stew() {
		return food_stew;
	}

	public void setFood_stew(boolean food_stew) {
		this.food_stew = food_stew;
	}
	
	
	
}
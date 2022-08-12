package miniProject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import miniProject.dbutil.DBUtils;
import miniProject.methods.Menu;

public class MenuDAO {
	

	private PreparedStatement preparedStatement;
	
	
	public Menu findMenu() {
		int id = (int)((Math.random() * 36) + 1);
		final String selectQuery = "SELECT * FROM lunch WHERE food_id = ?";
		Menu todo = null;
		
		try(Connection connection = DBUtils.getConnection();
			PreparedStatement preparedStatement = createPreparedStatement(connection, selectQuery, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			) {
			
			while(resultSet.next()) {
				todo = new Menu(resultSet.getString("food_type"),
								resultSet.getString("food_name"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return todo;
	}
	
	PreparedStatement createPreparedStatement(Connection connection, String sql, int id) throws SQLException {
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1,  id);			
		return preparedStatement;
	}
	
}
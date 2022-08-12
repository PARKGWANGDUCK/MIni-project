package miniProject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import miniProject.dbutil.DBUtils;
import miniProject.methods.User;

public class UserDAO {
	
	// DB로 회원 정보 옮기기
	private PreparedStatement preparedStatement;
	
	// user의 id와 password 입력 받기
	public boolean insertUser(User user) {
		final String USER_INSERT = "INSERT into profile(user_num, user_id, user_password) VALUES(?, ?, ?)";
		
		try{Connection connection = DBUtils.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(USER_INSERT);
			preparedStatement.setInt(1, user.getUser_num());
			preparedStatement.setString(2, user.getUser_id());
			preparedStatement.setString(3, user.getUser_password());
			preparedStatement.executeUpdate();
			
			} catch (Exception e) {
				e.printStackTrace();
			} 
		
		return false;
		
		}
	
	// 데이터베이스에 저장된 user의 id와 password 받아오기
	public User findUser(String user_id) {
	
		final String GET_ID = "SELECT * FROM profile WHERE user_id = ?";
		User user = null;
		
		try(Connection connection = DBUtils.getConnection();
			PreparedStatement preparedStatement = createPreparedStatement(connection, GET_ID, user_id);
			ResultSet resultSet = preparedStatement.executeQuery();
			) {
			while(resultSet.next()) {
				user = new User(resultSet.getString("user_id"),
								resultSet.getString("user_password"));
			}
		} catch (Exception e) {
				e.printStackTrace();
			}
		return user;
	}
	

	
	PreparedStatement createPreparedStatement(Connection connection, String sql, String user_id) throws SQLException {
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1,  user_id);
		return preparedStatement;
	}
		
		
}

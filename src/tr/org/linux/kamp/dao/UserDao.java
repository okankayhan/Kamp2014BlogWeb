package tr.org.linux.kamp.dao;

import tr.org.linux.kamp.FakeDb;
import tr.org.linux.kamp.model.User;

public class UserDao {

	public boolean save(User user){
		
		if (user.getId() == null || user.getId().trim().length() == 0) {
			String id = String.valueOf(System.currentTimeMillis());
			user.setId(id);
		}
		
		return FakeDb.save(user);
	}

	public boolean checkAuthentication(String username, String password) {
		return FakeDb.checkAuthentication(username, password);
	}
}

package tr.org.linux.kamp.service;

import tr.org.linux.kamp.dao.UserDao;
import tr.org.linux.kamp.model.User;

public class UserService {

	public boolean save(User user){
		UserDao userDao = new UserDao();
		return userDao.save(user);
	}

	public boolean checkAuthentication(String username, String password) {
		UserDao userDao = new UserDao();
		return userDao.checkAuthentication(username, password);
	}
}

package ch07.ex03;

import ch07.ex03.Dao.UserDao;
import ch07.ex03.Dao.UserDaoImpl;
import ch07.ex03.persentation.Console;
import ch07.ex03.persentation.UserIo;
import ch07.ex03.service.UserService;
import ch07.ex03.service.UserServiceImpl;

public class Main {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl(userDao);
		UserIo userIo = new UserIo(userService);

		userIo.play();
		Console.info("end.");
	}
}

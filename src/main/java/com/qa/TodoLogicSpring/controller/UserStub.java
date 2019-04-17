package com.qa.TodoLogicSpring.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.qa.TodoLogicSpring.model.User;

public class UserStub {
	private static Map<Long,User> users = new HashMap<Long,User>();
	private static Long idIndex=3L;
	static {
	}
	public static List<User>list(){
		return new ArrayList<User>(users.values());
	}
	public static User create(User user) {
		idIndex+=1;
		user.setId(idIndex);
		users.put(idIndex,user);
		return user;
	}
	public static User get(Long id) {return users.get(id);}
	public static User update(Long id, User note ) {
		users.put(id, note);
		return note;
		
	}
	public static User delete(Long id) {
		return users.remove(id);
		
	}
}

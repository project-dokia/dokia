package ibm.com.supplier.controller;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import ibm.com.supplier.dao.model.User;
import ibm.com.supplier.utils.LogTratative;

public class UserController {

	User user = null;
	Gson gson = new Gson();
	public ArrayList<User> listUser = new ArrayList<User>();
	public ArrayList<User> userList = new ArrayList<User>();
	String userJson = null;
	
	public User userText(String userText) {
		userJson = userText;
		userJson = LogTratative.replaceJson(userJson);
		getLogs(userText);
		userJson = LogTratative.removeLogs(userJson);
		userJson = LogTratative.replaceLogs(userJson);
		
		gson = new Gson();
		user = gson.fromJson(userJson.toString(), User.class);
		
		return user;
	}
	
	public List<User> getLogs(String text) {
		int firstPos = 0;
		int lastPos = 0;
		String init = "logs=[{";
		String end = "}]";
		
		firstPos = text.indexOf(init) + init.length();
		lastPos = text.indexOf(end, firstPos);
		
		TypeToken<List<User>> token = new TypeToken<List<User>>(){};
		if(lastPos > -1 && firstPos > -1) {
//			System.out.println(LogTratative.replaceLogs("[{" + "" + LogTratative.replaceJson(text.substring(firstPos, lastPos)) + "" + "\"}]"));
			userList = gson.fromJson(LogTratative.replaceLogs("[{" + "" + LogTratative.replaceJson(text.substring(firstPos, lastPos)) + "" + "\"}]"), token.getType());
		}		
		return userList;	
	}
}

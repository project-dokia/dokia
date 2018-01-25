package resolv.com.dokia.controller;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import resolv.com.dokia.dao.model.User;
import resolv.com.dokia.utils.LogTratative;

public class UserController {

	User user = null;
	Gson gson = new Gson();
	public ArrayList<User> listUser = new ArrayList<User>();
	public ArrayList<User> userList = new ArrayList<User>();
	String userJson = null;
	
	public User userText(String userText) {
		userJson = userText;
		userJson = LogTratative.replaceJson(userJson);
	
		gson = new Gson();
		user = gson.fromJson(userJson.toString(), User.class);
		
		return user;
	}
}

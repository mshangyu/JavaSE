package com.gem.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

import com.gem.service.UserService;
import com.gem.util.GetPostUtil;
import com.gem.util.URLUtil;
import com.gem.vo.User;

public class UserServiceImpl implements UserService {

	@Override
	public String getUserByName(String userName, String password) {
		// TODO Auto-generated method stub
		String url = URLUtil.MY_URL + "UserServlet";
		String param = "type=l&userName=" + userName + "&password="
				+ password+"";
		
		String s = GetPostUtil.sendGet(url, param);
		Log.i("url", s);
		return s;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		String url = URLUtil.MY_URL + "UserServlet";
		/*这里可能有问题*/
		String param = "type=json2";
		String json = GetPostUtil.sendGet(url, param);

		List<User> list = new ArrayList<User>();
		try {
			JSONArray array = new JSONArray(json);
			for (int i = 0; i < array.length(); i++) {
				JSONObject jsonObject = array.getJSONObject(i);
				User user;
				user = new User(jsonObject.getString("userName"),
						jsonObject.getString("password"),jsonObject.getString("eMail"),jsonObject.getString("sex"),
						jsonObject.getString("phoneNumber"));
				list.add(user);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return list;
	}

}

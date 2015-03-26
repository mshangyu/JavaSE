package com.test.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

import com.test.service.MedicineListService;

import com.test.util.GetPostUtil;
import com.test.util.URLUtil;
import com.test.vo.MedicineList;

public class MedicineListServiceImpl implements MedicineListService {

	public String MedicineListById(int id){
		String url = URLUtil.MY_URL + "MedicineListServlet";
		String param = "type=l&id=" + id +  "";
		
		String s = GetPostUtil.sendGet(url, param);
		Log.i("url", s);
		return s;
	
	}

	public List<MedicineList> getAllMedicineList() {
		// TODO Auto-generated method stub
		String url = URLUtil.MY_URL + "MediniceListServlet";
		String param = "type=json";
		String json = GetPostUtil.sendGet(url, param);

		List<MedicineList> list = new ArrayList<MedicineList>();
		try {
			JSONArray array = new JSONArray(json);
			for (int i = 0; i < array.length(); i++) {
				JSONObject jsonObject = array.getJSONObject(i);
				MedicineList medicineList;
				medicineList = new MedicineList(jsonObject.getInt("id"), jsonObject.getString("drugName"),
						jsonObject.getString("illName"),jsonObject.getString("adapte"), jsonObject.getString("price"), 
						jsonObject.getString("directions"), jsonObject.getString("state"), jsonObject.getString("reaction"),
						URLUtil.PICTURE_URL+jsonObject.getString("photo"), jsonObject.getString("drugCate"));
				list.add(medicineList);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return list;
	}

	


}

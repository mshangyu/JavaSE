package com.test.service;

import java.util.List;
import com.test.vo.MedicineList;
public interface MedicineListService {
	String MedicineListById(int id);
	List<MedicineList> getAllMedicineList();
}

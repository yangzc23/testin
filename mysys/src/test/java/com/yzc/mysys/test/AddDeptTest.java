package com.yzc.mysys.test;

import com.yzc.mysys.dao.DeptDAO;
import com.yzc.mysys.model.Dept;

public class AddDeptTest {
	public static void main(String[] args) throws Exception {
		//
		DeptDAO dao = new DeptDAO();
		//
		Dept dept = new Dept();
		//
		dept.setdName("工程部");
		//
		dept.setCity("广州");
		//
		dao.save(dept);
	}
}

package com.yzc.mysys.test;

import com.yzc.mysys.dao.DeptDAO;
import com.yzc.mysys.model.Dept;

public class UpdateDeptTest {
	public static void main(String[] args) throws Exception {
		DeptDAO dao = new DeptDAO();
		Dept d = dao.findById(70);
		d.setdName("工程中心");
		dao.modify(d);
	}
}

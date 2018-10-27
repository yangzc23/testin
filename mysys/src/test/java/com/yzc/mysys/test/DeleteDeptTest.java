package com.yzc.mysys.test;

import com.yzc.mysys.dao.DeptDAO;

public class DeleteDeptTest {
	public static void main(String[] args) throws Exception {
		DeptDAO dao = new DeptDAO();
		dao.delete(70);
	}
}

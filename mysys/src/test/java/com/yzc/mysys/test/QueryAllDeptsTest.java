package com.yzc.mysys.test;

import java.util.List;

import com.yzc.mysys.dao.DeptDAO;
import com.yzc.mysys.model.Dept;

public class QueryAllDeptsTest {
	public static void main(String[] args) throws Exception {
		DeptDAO dao = new DeptDAO();
		List<Dept> depts = dao.findAll();
		for(Dept d:depts){
			System.out.println(d);
		}
	}
}

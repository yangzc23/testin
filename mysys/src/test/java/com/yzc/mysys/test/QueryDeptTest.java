package com.yzc.mysys.test;

import com.yzc.mysys.dao.DeptDAO;
import com.yzc.mysys.model.Dept;

/**
 * 练习二、
 * 使用DeptDao创建一个数据库访问对象，通过该对象根据部门编号查询一个部门
 * @author yangzc
 *
 */
public class QueryDeptTest {
	public static void main(String[] args) throws Exception {
		DeptDAO dao = new DeptDAO();
		Dept dept = dao.findById(30);
		System.out.println(dept);
		
	}

}

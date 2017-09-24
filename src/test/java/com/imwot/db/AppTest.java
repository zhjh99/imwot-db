package com.imwot.db;

/**
 * Unit test for simple App.
 */
public class AppTest {
	public static void main(String[] str) {
		DB db = DBContext.getDbInstance();
		int n = db.getDbOperator("mysql1").queryForInt("select count(*) from user");
		System.out.println(n);
	}
}
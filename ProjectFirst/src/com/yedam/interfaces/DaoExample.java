package com.yedam.interfaces;
interface DataAccessObject {
	void select();
	void insert();
	void update();
	void delete();
	
}
class OracleDao implements DataAccessObject {
	String dbType = "Oracle DB";
	@Override
	public void select() {
		System.out.println(dbType + "���� �˻�");}
	@Override
	public void insert() {
		System.out.println(dbType + "�� ����");}
	@Override
	public void update() {
		System.out.println(dbType + "�� ����");}
	@Override
	public void delete() {
		System.out.println(dbType + "�� ����");}
		
	}
	
class MySqlDao implements DataAccessObject {
	String dbType = "MySql DB";
	@Override
	public void select() {
		System.out.println(dbType + "���� �˻�");}
		
	

	@Override
	public void insert() {
		System.out.println(dbType + "�� ����");}
		
	

	@Override
	public void update() {
		System.out.println(dbType + "�� ����");}
		
	

	@Override
	public void delete() {
		System.out.println(dbType + "�� ����");}
		
		
	
}
public class DaoExample {
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.select();
		dao.select();
		dao.select();
	}
}


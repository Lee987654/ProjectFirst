package com.yedam.interfaces;

public interface EmpService {
	// �������. ����X
	
	// �Ѱǻ���.
	public void createEmp(Employee emp); // public abstract void createEmp();
	
	// ��ü��ȸ.
	public void getEmpList();
	
	// �ѰǼ���.
	public void changeEmp(Employee emp);
	
	// �Ѱǻ���.
	public void removeEmp(int empId);
}

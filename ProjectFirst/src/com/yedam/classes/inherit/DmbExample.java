package com.yedam.classes.inherit;

public class DmbExample {
	public static void main(String[] args) {
		DmbCellPhone dcp = new DmbCellPhone("DMB��", "���", 10);
		// �θ�Ŭ����(CellPhone) �� �ʵ�
		System.out.println(dcp.model + ", " + dcp.color); 
		// �ڱ�Ŭ����(DmbCellPhone)�� �ʵ�
		System.out.println(dcp.channel);
		// �θ�Ŭ������ �޼ҵ�
	dcp.powerOn();
	dcp.bell();
	dcp.sendVoices("�ȳ��ϼ���");
	dcp.receiveVoices("�ݰ����ϴ�");
	// �ڱ� �ڽ��� �޼ҵ�
	dcp.turnOnDmb();
	dcp.changeChannel(12);
	dcp.turnOffDmb();
	
	dcp.powerOff();
	
	}

	
	
	
	
	
	
	
	}
}

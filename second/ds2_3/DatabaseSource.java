package com.flyingdigital.ds2_3;

public class DatabaseSource extends AbstractSource {
	public DatabaseSource() {
		
	}
	
	public void sourceName() {
		System.out.println("�����ݿ��ȡ����");
	}
	public void getSource() {
		getConnection();
		System.out.println("��ȡ���ݿ�����");
	}
	public  void getConnection() {
		System.out.println("���ݿ�����");
	}
}

package com.flyingdigital.ds2_3;

public class TextSource extends AbstractSource {
	public void sourceName() {
		System.out.println("���ı���ȡ����");
	}
	public void openFile() {
		System.out.println("���ڴ��ļ�");
	}
	public void getSource() {
		openFile();
		System.out.println("��ȡ�ļ�����");
	}
}

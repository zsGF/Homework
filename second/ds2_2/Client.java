package com.flyingdigital.ds2_2;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String plainText = "abcdefg";
		
		System.out.println("ʹ��A����");
		Cipher cipherA = new CipherA();
		DataOperator operatorA = new DataOperator();
		operatorA.setCipherA(cipherA);
		System.out.println("����ǰ�ַ���: "+plainText);
		System.out.print("���ܺ��ַ���: ");
		System.out.println(operatorA.encrypt(plainText));
		
		System.out.println("ʹ��B����");
		Cipher cipherB = new CipherB();
		DataOperator operatorB = new DataOperator();
		operatorB.setCipherA(cipherB);
		System.out.println("����ǰ�ַ���: "+plainText);
		System.out.print("���ܺ��ַ���: ");
		System.out.println(operatorB.encrypt(plainText));
	}

}

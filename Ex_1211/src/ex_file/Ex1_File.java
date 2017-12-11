package ex_file;

import java.io.File;

public class Ex1_File {

	/*
	 * IO (Input, Output)
	 * IO�� ����� ��Ʈ���� �ǹ�
	 * ��Ʈ�� = �����͸� ������ϱ� ���� ���
	 * JVM���� �ַܼ� ���� �������� Output
	 * �ֿܼ��� JVM���� ���� �������� Input
	 */
	
	//���� ��ü ������ ���� ��� (������ 1�� or �������� 2��)
	
	public static void main(String[] args) {
		String path = FilePath.PATH + "test.txt";
		//File Ŭ���� : �ܺη� ������ �� �ִ� Ŭ����
		File f = new File(path);
		
		//file Ŭ������ �����ϴ� ��ΰ� ������ ���(isFile())
		// �����ϴ� ��ΰ� ������ ���(isDirectory())
		if(f.isFile()) {
		System.out.println("������ ũ�� : " + f.length());
		}
		
	}
}

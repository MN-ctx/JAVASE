package com.day07;

import java.util.Random;

public class Demo1Random {
	/*
		Random : ���������
		
		1. ����	: import java.util.Random;
				    �����Ķ�������������ඨ�������

		2. �������� : Random r = new Random();
					���������ʽ���棬r �Ǳ����������Ա䣬�����Ķ��������

		3. ��ȡ����� : int number = r.nextInt(10);	//��ȡ���ݵķ�Χ��[0,10) ����0,������10
					���������ʽ���棬number�Ǳ����������Ա䣬����10���Ա䡣�����Ķ��������
		
		����: ���������1-10֮���
	*/
	public static void main(String[] args){
		// 2. ��������
		Random r = new Random();
		
		for(int i = 1; i <= 10; i++){
			// 3. ��ȡ�����
			int num = r.nextInt(10) + 1;		// 1-10
			System.out.println(num);
		}
		
		
		
	}
}
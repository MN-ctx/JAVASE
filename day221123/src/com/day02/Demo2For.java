package com.day02;

public class Demo2For {
	/*
		�����ڿ���̨���1-5��5-1������
		
		����:
			
			1. ��1��ʼ��5���������ó�ʼ����1��ʼ
			2. �����ж�����Ϊû�е�5��ʱ�����ִ�У�ִ�е�����5�������
			3. ��1��5��ÿ������1��������������ÿ��+1
			4. ���������е�����д��ѭ���ṹ�ڲ�����ӡ��Ӧ����
			
		ע��:
			1. ѭ����, ����ѭ���ı���, ������Ϊ�߼���֯��ѭ�����н���ʹ�õ�.
			
			2. ѭ���� �����������, ��Ҫ���޵���Ϊֻ����++
	*/
	public static void main(String[] args) {
		// 1. ��1��ʼ��5���������ó�ʼ����1��ʼ
		// 2. �����ж�����Ϊû�е�5��ʱ�����ִ�У�ִ�е�����5�������
		// 3. ��1��5��ÿ������1��������������ÿ��+1
		for(int i = 1; i <= 5; i++){
			// 4. ���������е�����д��ѭ���ṹ�ڲ�����ӡ��Ӧ����
			System.out.println(i);		// 1 2 3
		}
		
		System.out.println("--------------");
		
		for(int i = 5; i >= 1; i--){
			System.out.println(i);		// 5 4 3..
		}
	}
}
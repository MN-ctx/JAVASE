package com.day06;

public class Demo1Continue {
	/*
		continue : ����ĳ��ѭ�������ݵ�ִ��
		
		ע�⣺ʹ���ǻ�����������, ��ѭ���ڲ�ʹ��.
		
		����: ģ��������еĹ��� 1-24��, 4�㲻ͣ.
	*/
	public static void main(String[] args){
		for(int i = 1; i <= 24; i++){
			if(i == 4){
				continue;
			}
			System.out.println(i + "�㵽��~");
		}
	}
	
}
package com.day06;

public class Demo2Break {
	/*
		break : ��ֹѭ�������ݵ�ִ��
		ע�⣺ʹ���ǻ����������Ƶ�
				break���ֻ����ѭ����switch�н���ʹ��.
				
		����: ģ��20�깤����80��, 60������.
	*/
	public static void main(String[] args){
		for(int i = 20; i <= 80; i++){
			if(i == 60){
				break;		// ��������ѭ��
			}
			System.out.println(i + "�������ϰ�");
		}
	}
	
}
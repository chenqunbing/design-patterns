package ������ģʽ;

public class Saler extends Visitor{


	public void visit(Apple apple){
		System.out.println("����Ա"+name+"����ƻ���۸�!");
	}
	public void visit(Book book){
		System.out.println("��ӪԱ"+name+"�����鱾�۸�!");
	}
	
}

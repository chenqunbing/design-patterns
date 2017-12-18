package 访问者模式;

public class Saler extends Visitor{


	public void visit(Apple apple){
		System.out.println("收银员"+name+"计算苹果价格!");
	}
	public void visit(Book book){
		System.out.println("收营员"+name+"计算书本价格!");
	}
	
}

package 迭代模式案例;

public interface TVIterator {
	
	void setChannel(int i);
	void next();
	Object currentChannel();
	void previous();
	boolean isLast();
	boolean isFirst();

}

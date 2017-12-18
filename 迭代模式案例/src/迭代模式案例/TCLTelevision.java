package 迭代模式案例;

public class TCLTelevision implements Television{

	private Object[] obj={"湖南卫视","北京卫视","安徽卫视","南昌卫视"};
	
	public TVIterator createIterator(){
		return new TCLIterator();
	}
	
	public class TCLIterator implements TVIterator{
		
		private int currentIndex=0;
		
		public void next(){
			if(currentIndex<obj.length){
				currentIndex++;
			}
		}
		public void previous(){
			if(currentIndex>0){
				currentIndex--;
			}
		}
		
		public void setChannel(int i){
			currentIndex=i;
		}
		public Object currentChannel(){
			return obj[currentIndex];
		}
		
		public boolean isLast(){
			return currentIndex==obj.length;
		}
		
		public boolean isFirst(){
			return currentIndex==0;
		}
		
		
	}
	
}

public class TimeAdd {
	long hours;
	long minutes;
	long seconds;
	
	
	public TimeAdd(long h,long m,long s)
	{
		hours=h;
		minutes=m;
		seconds=s;
}
	void add1(TimeAdd obj2)
	{
		this.hours +=obj2.hours;
		this.minutes +=obj2.minutes;
		this.seconds += obj2.seconds;
		
		if (seconds > 59) {
			seconds = seconds - 60;
			minutes = minutes + 1;
		}
			if (minutes > 59) {
				minutes = minutes - 60;
				hours = hours + 1;
			} 
	}

	
	void display()
	{
		System.out.println(this.hours+":"+this.minutes+":"+this.seconds);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeAdd obj1=new TimeAdd(10,30,59);
		TimeAdd obj2=new TimeAdd(12,30,40);
		obj1.add1(obj2);
		System.out.println("The addition of Two time  is:");
		obj1.display();
	}

	}

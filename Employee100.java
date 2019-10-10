public class Employee100 {
	int id;
	String name;
	Address address; //Aggregation
	
	public Employee100(int id, String name,Address address) 
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display()
	{
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.Country);
	}
	public static void main(String[] args)
	{
		Address address1=new Address("BLR","Karnataka","india");
		Address address2=new Address("Mumbai","Maharastra","india");
	Employee100 e1=new Employee100(111,"Varun",address1);
	Employee100 e2=new Employee100(112,"Singh",address2);
	e1.display();
	e2.display();
}
}

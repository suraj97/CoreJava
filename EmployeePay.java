class EmployeePay {
    EmployeePay() {
    }

     

    public static void main(String[] args) {
       Manager mgrObj = new Manager("Henry", 5500.65, "Sydney", "Accounts");
       double payTotal = mgrObj.totalpay();
       double less = mgrObj.deduction(5);
       double netPay = payTotal - less;
       System.out.println("\nManager Details");
       System.out.println("===================================");
       mgrObj.show();
       System.out.println("Total Pay: \t\t" + payTotal);
       System.out.println("Net Pay: \t\t" + netPay);
       Director dirObj = new Director("Stephen", 32400.00, "New York",
       8000);
       payTotal = dirObj.totalpay();
       less = dirObj.deduction(5);
       netPay = payTotal - less;
       System.out.println("\n\nDirector Details");
       System.out.println("============================");
       dirObj.show();
       System.out.println("Total Pay: \t\t" + payTotal);
       System.out.println("Net Pay: \t\t" + netPay);
    }
}
abstract class Employee200{
	String name;
	double basic;
	String address;

	Employee200()
	{
	}
		Employee200(String str,double sal,String addr)
		{
			name=str;
			basic=sal;
			address=addr;
		}
		void show()
		{
			System.out.println("Name:\t\t\t"+name);
			System.out.println("Address:\t\t\t"+address);
			System.out.println("Basic:\t\t\t"+basic);
		}
		abstract double totalpay();
		double deduction(int leave)
		{
			double lesspay;
			
			if(leave<=5)
			{
				lesspay=(0.25*basic);
			} else
			{
				lesspay=(0.5*basic);
			}
			return lesspay;
		}
	}
	class Manager extends Employee200
	{
		String department;
		Manager()
		{
			
		}
			Manager(String str,double sal,String addr,String dept)
			{
				super(str,sal,addr);
				department = dept;
			}
			void show()
			{
				super.show();
				System.out.println("Department:\t\t" +department);
			}
			double totalpay()
			{
				double totalAmount = 0;
					double houseRentAllowance = (basic*0.08);
					double dearnessAllowance = (basic*0.3);
					double medicalAllowance = 1500;
					totalAmount=basic+houseRentAllowance;
					return totalAmount;
			}
	}
	class Director extends Employee200
	{
		double transportAllowance;
		Director(){
	}
		Director(String str,double sal,String addr,double allowance)
		{
			super(str,sal,addr);
			transportAllowance=allowance;
		}
		void show()
		{
			super.show();
			//System.out.println("Transport allownace:\t\t" +transportAllowance);
		}
		double totalpay()
		{
			double totalAmt= 0;
			double houseRentAllowance = (basic*0.20);
			double dearnessAllowance = (basic*0.5);
			double medicalAllowance = 4500;
			double entertainmentAllowance=5000;
			totalAmt=basic+houseRentAllowance+dearnessAllowance+medicalAllowance+entertainmentAllowance;
			return totalAmt;
		}
		
		
		
		
		
		
	}
		
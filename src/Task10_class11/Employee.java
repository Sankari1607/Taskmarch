package Task10_class11;

import java.util.Scanner;

public class Employee {


		// TODO Auto-generated method stub
		
		int empid; 
		int salary; 
		int Annualsal;
		String firstname;
		String lastname; 
		String Fullname;
		
		public int getempid()
		{
			return empid;
		}
		
		public void setempid(int empid) {
			this.empid = empid;
		}
		public String getfirstname() {
			return firstname;
			
		}
		public void setfirstname(String firstname) {
			this.firstname = firstname;
						
		}
		public String getlastname() {
			return lastname;
		}
		public void setlastname(String lastname) {
			
			this.lastname= lastname;
		}
				
		public int getsalary() {
			return salary;
			
		}
		public void setsalary(int salary) {
			this.salary = salary;
			
		}
		public int getAnnualsal() {
			return Annualsal;
			
		}
		public void setAnnualsal(int Annualsal) {
			this.Annualsal = Annualsal;
		}
		public String toString() {
			return "Employee [empid =" + empid + ", +EmpName = "+ firstname  +   lastname + ",Empsalary = "+salary+"]";
			
		}
		


		public static void main(String[] args) {		
		
			
			
			
			Employee emp= new Employee();
			emp.setempid(105);
			emp.setfirstname("Sankari");
			emp.setlastname("Muthukumaran");
			emp.setsalary(25000);
			System.out.println(emp);
			
			int increment = 0;
			int Annualsal = emp.getsalary() * 12;
			if ((Annualsal >= 200000)&& (Annualsal <= 3000000)) {
				increment+=(Annualsal*2)/100;
				Annualsal = Annualsal+increment;
				emp.setAnnualsal(Annualsal);
				
				System.out.println("\n Salary is incremented =   " + Annualsal);
				
			}else {
				System.out.println("\n Salary is not incremented\n");
				System.out.println(emp);
			}
		
		}
		
	}



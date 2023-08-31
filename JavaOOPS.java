// // inherihance
// public class JavaOOPS {
//     public static void main(String args[]){

//        Client s1=new Client();
//        s1.setEmployee("amazon", 1000000);
//        s1.setRole("deveopler");
//        s1.setClient(5);
//        s1.getEmployee();
//     }
// } 
// class Employee{
//     int salary;
//     String company;
//     public void setEmployee(String company,int salary) {
//         this.company=company;
//         this.salary=salary;
//     }
// }
// class Engineer extends Employee{
//     String role;
//     public void setRole(String role) {
//         this.role = role;
//     }
    
// }
// class Client extends Engineer {
//    int client;

//     public void setClient(int client) {
//         this.client = client;
//     }
//     public void getEmployee() {
//         System.out.println("client : "+client);
//         System.out.println("Role : "+role);
//         System.out.println("salary : "+salary);
//         System.out.println("company : "+company);
//     }
// }


// inherihance
public class JavaOOPS {
    public static void main(String[] args)
	{

		// Creating object of sub class
		// inside main() method
		Derived d = new Derived(10, 20);

		// Invoking method inside main() method
		d.Display();
	}
}
class Base {
	int x;

	// Constructor of super class
	Base(int _x) 
    { 
        x = _x; 
    }
}

// Class 2
// Sub class
class Derived extends Base {

	int y;

	// Constructor of sub class
	Derived(int _x, int _y)
	{

		// super keyword refers to super class
        super(_x);
		// x = _x;
		y = _y;
	}

	// Method of sub class
	void Display()
	{
		// Print statement
		System.out.println("x = " + x + ", y = " + y);
	}
}


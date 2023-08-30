// inherihance
public class JavaOOPS {
    public static void main(String args[]){
      
       Engineer s1=new Engineer();
       s1.setEmployee("amazon", 1000000);
       s1.setRole("deveopler");
       s1.getEmployee();
    }
} 

class Employee{
    int salary;
    String company;
    public void setEmployee(String company,int salary) {
        this.company=company;
        this.salary=salary;
    }
}
class Engineer extends Employee{
    String role;
    public void setRole(String role) {
        this.role = role;
    }
    public void getEmployee() {
        System.out.println("Role : "+role);
         System.out.println("salary : "+salary);
        System.out.println("company : "+company);
    }

}
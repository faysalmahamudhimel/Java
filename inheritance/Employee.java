
package inheritance;


public class Employee {
    
    void work(){
         System.out.println("i am worker");
    }
    
    int getSalary(){
        
        return 2000;
    }
    
    public static void main(String[] args) {
       HRManager obj = new HRManager();
       
       obj.work() ;
       obj.addEmployee();
       obj.getSalary();
        
    }
    
}

class  HRManager extends Employee{
    
    @Override
    void work(){
        System.out.println("i am not worker");    
        
}
    
    void addEmployee(){
        System.out.println(" i am employee");
    }
}


package overloading_constructor;


public class Teacher {
    
    String name , gender ;
    String phone ;
    
    Teacher(){                                 // default constructor
    
        
        System.out.println("No valoue");
    }
    
    Teacher(String m,String n,String p) // methode overloading
    {
        
        name = m;
        gender = n ;
        phone = p ;
              
    }
    
    void display(){
               
        System.out.println("Name:"+name);
        System.out.println("Gender:"+gender);
        System.out.println("Phone:"+phone);

                
    }
    
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher("Himel","Male","01572900426") ; //class object
        
        teacher1.display();
    }
    
    
    
}

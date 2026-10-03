
package Static_Keyword;


public class Teacher {
    
    String name;
    int id;
    
    static String universityname="PSTU" ; //static keyword refer to the class variable
    
    
    Teacher(String m,int n){
        
        name = m ;
        id = n ;  
}
    void display(){
    
        System.out.println("Name= "+name);
        System.out.println("Name= "+id);
        System.out.println("University Name= "+universityname);
 }
    
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher("Himel",24020) ;
        Teacher teacher2 = new Teacher("Hiall",22020) ;

        teacher1.display();
        System.out.println(" ");
        teacher2.display();
        
    }
    }



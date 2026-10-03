
package Static_Keyword;


public class Student1 {
    
static int count = 0 ;

Student1()
{ 
    count++ ;
    

}

void total(){
    System.out.println("Total : "+count);
}

    public static void main(String[] args) {
        
        Student1 student1 = new Student1();
        student1.total();
        
         Student1 student2 = new Student1();
        student2.total();
        
        
         Student1 student3 = new Student1();
        student3.total();
    }

}

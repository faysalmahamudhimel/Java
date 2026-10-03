
package factorial;

import java.util.Scanner ;

public class recursion {
    
    int fact(int num) {
        
        if(num==1){
            return 1 ;
        }
        
        else{
            return num*fact(num-1) ;
        }
        
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        recursion obj = new recursion();
        System.out.print("Enter Input Number: ");
        int num = input.nextInt() ;
        
        obj.fact(num) ;
        
        System.out.println(  obj.fact(num) );
       
        
    }
    }


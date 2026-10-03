
package methodeoverload;


public class variablelength {
    
    void add(int ... num){  //veriable lenght 
      int sum = 0 ;
      for(int x : num){
          
          sum += x ;
      }
      
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        
        variablelength obj = new variablelength() ;
        
        obj.add(10,20,30);
        obj.add(10,20);
                
         obj.add(10,20,30,40,60);  // amra jotoguluoie dei na keno oigula sob jog korbe


        
    }
    
}

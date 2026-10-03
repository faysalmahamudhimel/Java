
package methodeoverload;


public class overload {
    
    void add(){
        System.out.println("nothing");
    }
    
    void add(int a,int b){
    
        System.out.println(a+b);
    }
    
    void add(double a,double b){
    
        System.out.println(a+b);
    }
    
    void add(String a,String b){
    
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
    
        System.out.println(a+b+c);
    }
    
    public static void main(String[] args) {
        
        overload obj = new overload();
        
        obj.add();
        obj.add(12,3);
        obj.add("himel","rana");
        obj.add(7,9,1);



    }
    
    
    }
    


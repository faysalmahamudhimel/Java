package inheritance2;

public class Main {

    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount(500);

        account.deposit(200);

        account.withdraw(300);

        account.withdraw(250);
        
        
        
        
        //cheeta animal
        
        System.out.println(" ");
        
         Cheetah obj = new  Cheetah();
         obj.move();
         
         
         
         
//person problem          
          Employee emp = new Employee(
                "Himel",
                "Mahamud",
                101,
                "Software Developer"
        );

        System.out.println("First Name: " + emp.getFirstName());
        System.out.println("Last Name: " + emp.getLastName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
    
        
        
        //circle 
       Circle circle = new Circle(5);

        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());
   
    //vechile 
        System.out.println("  ");
    
        Car car = new Car(
            "Toyota",
            "Corolla",
            2024,
            "Petrol"
        );

        System.out.println("CAR");

        car.displayInfo();

        System.out.println(
            "Fuel Efficiency: " + car.fuelEfficiency() + " km/l"
        );

        System.out.println(
            "Distance for 10 liters: "
            + car.distanceTraveled(10) + " km"
        );

        System.out.println(
            "Maximum Speed: " + car.maximumSpeed() + " km/h"
        );


        Motorcycle bike = new Motorcycle(
            "Yamaha",
            "R15",
            2025,
            "Petrol"
        );

        System.out.println("\nMOTORCYCLE");

        bike.displayInfo();

        System.out.println(
            "Fuel Efficiency: " + bike.fuelEfficiency() + " km/l"
        );

        System.out.println(
            "Distance for 5 liters: "
            + bike.distanceTraveled(5) + " km"
        );

        System.out.println(
            "Maximum Speed: " + bike.maximumSpeed() + " km/h"
        );
    
        
        
        // employee hairarkey 
        


      
    }
}
    

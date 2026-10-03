package employeee ;


public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager(
            "Rahim",
            "Dhaka",
            80000,
            "Project Manager"
        );

        Developer developer = new Developer(
            "Karim",
            "Khulna",
            60000,
            "Software Developer"
        );

        Programmer programmer = new Programmer(
            "Himel",
            "Jhenaidah",
            50000,
            "Java Programmer"
        );


        System.out.println("MANAGER");

        manager.displayInfo();

        System.out.println(
            "Bonus: " + manager.calculateBonus()
        );

        manager.performanceReport();

        manager.manageProjects();


        System.out.println("\nDEVELOPER");

        developer.displayInfo();

        System.out.println(
            "Bonus: " + developer.calculateBonus()
        );

        developer.performanceReport();

        developer.manageProjects();


        System.out.println("\nPROGRAMMER");

        programmer.displayInfo();

        System.out.println(
            "Bonus: " + programmer.calculateBonus()
        );

        programmer.performanceReport();

        programmer.manageProjects();
    }
}
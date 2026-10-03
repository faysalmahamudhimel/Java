
package employeee;


class Employee {

    String name;
    String address;
    double salary;
    String jobTitle;

    Employee(String name, String address,
             double salary, String jobTitle) {

        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    double calculateBonus() {
        return salary * 0.05;
    }

    void performanceReport() {
        System.out.println(
            name + " has a satisfactory performance."
        );
    }

    void manageProjects() {
        System.out.println(
            name + " is managing company projects."
        );
    }

    void displayInfo() {

        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Job Title: " + jobTitle);
    }
}

class Manager extends Employee {

    Manager(String name, String address,
            double salary, String jobTitle) {

        super(name, address, salary, jobTitle);
    }

    @Override
    double calculateBonus() {
        return salary * 0.20;
    }

    @Override
    void performanceReport() {
        System.out.println(
            name + " manages the team effectively."
        );
    }

    @Override
    void manageProjects() {
        System.out.println(
            name + " is managing multiple projects."
        );
    }
}

class Developer extends Employee {

    Developer(String name, String address,
              double salary, String jobTitle) {

        super(name, address, salary, jobTitle);
    }

    @Override
    double calculateBonus() {
        return salary * 0.15;
    }

    @Override
    void performanceReport() {
        System.out.println(
            name + " develops software efficiently."
        );
    }

    @Override
    void manageProjects() {
        System.out.println(
            name + " manages software development tasks."
        );
    }
}


class Programmer extends Employee {

    Programmer(String name, String address,
               double salary, String jobTitle) {

        super(name, address, salary, jobTitle);
    }

    @Override
    double calculateBonus() {
        return salary * 0.10;
    }

    @Override
    void performanceReport() {
        System.out.println(
            name + " writes and maintains programs."
        );
    }

    @Override
    void manageProjects() {
        System.out.println(
            name + " handles programming tasks."
        );
    }
}
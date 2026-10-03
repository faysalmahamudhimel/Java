
package oop;

public class oop1 {
    public static void main(String[] args) {

        Teacher teacher1; // object declar

        teacher1 = new Teacher(); // object create

        teacher1.name = "Himel";
        teacher1.gender = "Male";
        teacher1.id = 2402068;

        System.out.println("Name:" + teacher1.name);
        System.out.println("Name:" + teacher1.gender);
        System.out.println("Name:" + teacher1.id);

        Teacher teacher2 = new Teacher();

        teacher2.name = "azrul";
        teacher2.gender = "Male";
        teacher2.id = 240290;

        System.out.println(" ");

        teacher2.display(); // methode calling

        Teacher teacher3 = new Teacher();
        teacher3.setinformation("JAVIR", "kaLAM", 2402039);
        System.out.println(" ");
        teacher3.display();

    }

}

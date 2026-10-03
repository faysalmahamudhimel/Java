package inheritance;

public class Animal {

    void makesound() {
        System.out.println("cat called mew");
    }

    
}

class cat extends Animal {

    @Override
    void makesound() {
        System.out.println("cat is barking");
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance3;


class ParentPrivate {

    private void parentMethod() {
        System.out.println("This is parent class");
    }
}

class ChildPrivate extends ParentPrivate {

    void childMethod() {
        System.out.println("This is child class");
    }
}
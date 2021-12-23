package java_progs.oops;

class Parent {
    String surname = "Kurru";
    String place = "vizag";

    public Parent() {
    }

    public void Home() {
        System.out.println("House details");
        System.out.println("3bhk villa,velpula street, anakapalle");
    }

    public void Car() {
        System.out.println("Range Rover");
        System.out.println("Speed= " + 100 + "horsePower");
    }

}

class child extends Parent {
    String name;
    String surname;
    String place;

    public child(String name) {
        this.name = name;
        this.surname = super.surname;
        this.place = super.place;

    }

    @Override
    public void Car() {
        System.out.println("I have Audi A7 006");
        System.out.println("Speed= " + 100000 + " horsePower");
    }

    public void display() {
        System.out.println("I am " + this.name + " " + this.surname);
        this.Car();
    }
}

public class InheritanceEx {
    public static void main(String[] args) {
        child cld = new child("Charan");
        cld.display();

    }
}

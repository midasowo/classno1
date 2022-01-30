package eu.emidas;

public class Human {
    String name = "Krzysztof";
    int age;
    boolean facet=true;

    public Human(String name, int age, boolean facet) {
        this.name = name;
        this.age = age;
        this.facet = facet;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String bogu) {
        this.name=bogu;
    }

    public static void main(String[] args) {
        Human milena= new Human("Milena",2,false);
        System.out.println(milena.name);
        System.out.println(milena.age);
        System.out.println(milena.facet+" facet");
        milena.age = 6;
        System.out.println(milena.age);
        Human bogus= new Human("Bogu");
        System.out.println(bogus.name);
    }
}

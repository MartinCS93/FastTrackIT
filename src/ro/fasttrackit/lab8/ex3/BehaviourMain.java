package ro.fasttrackit.lab8.ex3;

public class BehaviourMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Chicken chicken = new Chicken();
        Dog dog = new Dog();
        Duck duck = new Duck();
        Mouse mouse = new Mouse();

        print(cat);
        System.out.println();
        print(chicken);
        System.out.println();
        print(dog);
        System.out.println();
        print(duck);
        System.out.println();
        print(mouse);

    }

    public static void print(Behaviour action) {
        System.out.println(action.walk());
        System.out.println(action.talk());
        System.out.println(action.eat());

    }
}

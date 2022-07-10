package ro.fasttrackit.lab10.Example;

public class Group {
    public static void main(String[] args) {
        Person ana = new Person("Ana", null, 'F', 172);
        Person geamanaAna = new Person("Ana", null, 'F', 172);


        System.out.println(ana);
        System.out.println(geamanaAna);
        System.out.println(ana == geamanaAna);
        System.out.println(ana.toString().equals(geamanaAna.toString()));
        System.out.println(ana == ana);
        System.out.println(ana.equals(geamanaAna));
        System.out.println(ana.equals(ana));
    }
}

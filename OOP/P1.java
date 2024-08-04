 class Person {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public Person(int b){
        System.out.println(b);
    }
    public int getAge(int age) {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class P1 {

    public static void main(String[] args) {
        Person pr = new Person(21, "lav");
        Person pr1 = new Person(12);

        // System.out.println("Age: " + pr.getAge());
        System.out.println("Name: " + pr.getName());
        int a=pr.getAge(22);
        System.out.println(a);
    }
}

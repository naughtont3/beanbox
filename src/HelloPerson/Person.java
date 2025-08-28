public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age  = age;
    }

    public void greet(String other) {
        System.out.println("Hello " + other + ", I'm " + name);
    }

    public int addToAge() {
        age += 1;
        return age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


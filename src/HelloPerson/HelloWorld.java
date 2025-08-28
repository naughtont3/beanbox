/**
 * Short example for creating an instance of a Person class
 * and printing some output.
 *
 * @version v2
 */
public class HelloWorld {

    public static void sayInfo(Person p) {
        System.out.println(String.format("%10s is %d",
                                         p.getName(),
                                         p.getAge()));
        return;
    }

    public static void main(String[] args) {
        // Instantiate Person using the constructor
        Person myBuddy = new Person("Tommy", 21);
        Person mySister = new Person("Catherine", 16);

        // Call methods
        myBuddy.greet(mySister.getName());
        mySister.greet(myBuddy.getName());

        sayInfo(myBuddy);
        sayInfo(mySister);

        myBuddy.addToAge();

        System.out.println(String.format("HAPPY BIRTHDAY %s!",
                                         myBuddy.getName()));

        sayInfo(myBuddy);

        return;
    }
}


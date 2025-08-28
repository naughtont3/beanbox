/**
 * Short example for creating an instance of a Person class
 * and printing some output.
 *
 * @version v1
 */
public class HelloWorld1 {

    public static void main(String[] args) {
        // Instantiate Person using the constructor
        Person myBuddy = new Person("Tommy", 21);
        Person mySister = new Person("Catherine", 16);

        // Call methods
        myBuddy.greet(mySister.getName());
        mySister.greet(myBuddy.getName());

        System.out.println(String.format("%10s is %d",
                                         myBuddy.getName(),
                                         myBuddy.getAge()));

        System.out.println(String.format("%10s is %d",
                                         mySister.getName(),
                                         mySister.getAge()));

        myBuddy.addToAge();

        System.out.println(String.format("HAPPY BIRTHDAY %s!",
                                         myBuddy.getName()));

        System.out.println(String.format("%10s is %d",
                                         myBuddy.getName(),
                                         myBuddy.getAge()));
    }
}

public class HelloWorldPrinter {
    public String message;
    public int age;

    public HelloWorldPrinter() {
        System.out.println("I am constructor");
    }

    public HelloWorldPrinter(String newMessage, int newAge) {
        message = newMessage;
        age = newAge;
    }

    public void printHelloWorld() {
        System.out.println("Hello, " + message + "Her age is " + age);
    }
}

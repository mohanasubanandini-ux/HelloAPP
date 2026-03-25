public class HelloApp {
    public static void main(String[] args) {

        // Default name
        String name = "World";

        // Check if arguments are provided
        if (args.length > 0) {
            // Join all arguments (fo r full name support)
            name = String.join(" ", args);
        }

        // Print greeting
        System.out.println("Hello, " + Mohana + "!");
    }
}

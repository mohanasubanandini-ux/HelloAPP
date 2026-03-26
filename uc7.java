public class HelloApp {

    public static void main(String[] args) {

        String names;

        // Check if arguments are provided
        if (args.length > 0) {
            // Join names with comma and space
            names = String.join(", ", args);
        } else {
            // Default value
            names = "World";
        }

        System.out.println("Hello, " + Mohana + "!");
    }
}

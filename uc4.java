public class HelloApp {
    public static void main(String[] args) {

        String output;

        // Check if names are provided
        if (args.length > 0) {

            // Build names with comma separation
            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }

            output = "Hello, " + nameBuilder.toString() + "!";
        } else {
            output = "Hello, World!";
        }

        // Print result
        System.out.println(output);
    }
}

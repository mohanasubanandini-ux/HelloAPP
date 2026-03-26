public class HelloApp {

    public static void main(String[] args) {

        // If no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            StringBuilder nameBuilder = new StringBuilder();

            // Append names with comma
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove trailing ", "
            String result = nameBuilder.toString();
            if (result.length() > 0) {
                result = result.substring(0, result.length() - 2);
            }

            System.out.println("Hello, " + result + "!");
        }
    }
}

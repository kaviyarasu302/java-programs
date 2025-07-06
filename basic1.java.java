public class CommandLineExample {
    public static void main(String[] args) {
        // Check if exactly two command line arguments are provided
        if (args.length != 2) {
            System.out.println("Error: Please pass exactly two arguments.");
        } else {
            // Extract the two command line arguments
            String company = args[0];
            String city = args[1];
            
            

            // Output the required format
            System.out.println(company + " Technologies " + city);
        }
    }
}

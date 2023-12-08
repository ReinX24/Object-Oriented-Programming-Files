public class FinallyBlock {

    public static void main(String[] args) {

        /*
         * 59. What is the output of the following code snippet?
         * a. Error: / by zero
         * b. Finally block executed.
         * c. Both a and b
         * d. None of the above
         * 
         * Number 59 should be c. both a and b because it prints both the exception
         * message and the finally block message.
         */
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

}

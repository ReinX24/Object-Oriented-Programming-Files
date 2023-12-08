public class TryCatch {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * 33. Which keyword is used to indicate that a method can potentially throw an
     * exception in Java?
     * a. throws
     * b. throw (answer in document)
     * c. try
     * d. catch
     * 
     * Number 33 in OOP exam should be 'throws' instead of 'throw'.
     * If we use throw instead of throws, it causes a syntax error.
     */
    public static void divideByZero() throws ArithmeticException {
        int result = 10 / 0;
        System.out.println(result);
    }

}
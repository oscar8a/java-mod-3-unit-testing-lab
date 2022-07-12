public class FizzBuzz {
    public String fizzBuzzString(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Function does not take null values in order to FizzBuzz");
        }
        if (str.startsWith("f") && str.endsWith("b")) return "FizzBuzz";

        if (str.startsWith("f")) return "Fizz";
        if (str.endsWith("b")) return "Buzz";

        return str;
    }

}
public class Main {
    public static void main(String[] args) {
        FizzBuzz f = new FizzBuzz();
        // manual testing
        System.out.println(f.fizzBuzzString("fun")); // Fizz
        System.out.println(f.fizzBuzzString("pub")); // Buzz
        System.out.println(f.fizzBuzzString("fab")); // FizzBuzz
        System.out.println(f.fizzBuzzString(null)); // Throw Exception
    }
}

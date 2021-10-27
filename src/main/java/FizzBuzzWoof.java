public class FizzBuzzWoof {

    public String FizzBuzzWoof(int n) {

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print("Fizz" + ",");
            }
            if (i == 3 || i % 10 == 3 || i % 10 == 3) {
                System.out.print("Fizz" + ",");
            }
            if (i % 5 == 0) {
                System.out.print("Buzz" + ",");
            }
            if (i == 5 || i % 10 == 5 || i % 10 == 5) {
                System.out.print("Fizz" + ",");
            }
            if (i % 7 == 0) {
                System.out.print("Fizz" + ",");
            }
            if (i == 7 || i % 10 == 7 || i % 10 == 7) {
                System.out.print("Fizz" + ",");
            }
            if (i % 3 != 0 && i != 3 && i % 10 != 3 && i % 10 != 3 && i % 5 != 0 && i != 5 && i % 10 != 5 && i % 10 != 5 && i % 7 != 0 && i != 7 && i % 10 != 7 && i % 10 != 7) {

                System.out.print(i + ",");
            }
        }
        return null;
    }
}
package wag.Alogorithm;

public class FizzBass {
    public static void fizzBass(int []array) {



        for (int i = 0; i <= 100; i++) {

            if (array[i] % 5 == 0 && array[i] % 3 == 0) {
                System.out.println("fizzbass");
            } else if (array[i] % 3 == 0) {
                System.out.println("fizz");
            } else if (array[i] % 5 == 0) {
                System.out.println("bass");
            } else { String res = String.valueOf(array[i]);
                System.out.println(res);
            }
        }
    }
}

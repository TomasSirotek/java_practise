package unit_prime_num;

public class Main {
    public static void main(String[] args) {
        // Print prime numbers/ composite number // user modular operator


        for (int number = 2; number < 500000; number++) {
            boolean isPrime = true;

        for (int div = 2; div * div <= number; div++) {

            if(number % div == 0 ){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(number);
        }

        }
    }
}

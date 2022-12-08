package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    private boolean prime(int number) {
        if (number == 2) {
            return true;
        }

        int i = 2;

        while (i <= Math.sqrt(number)) {
            if (number % i == 0) {
                return false;
            }

            i++;
        }

        return true;
    }

    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;

        while (i <= printToInclusive) {
            boolean isPrime = this.prime(i);

            if (isPrime) {
                System.out.println(i);
            }

            i++;
        }
    }
}

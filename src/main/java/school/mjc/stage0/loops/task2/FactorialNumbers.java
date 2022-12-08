package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    private int factorial(int number) {
        if (number == 0) {
            return 1;
        }

        int i = 1;
        int M = 1;

        while (i <= number) {
            M = M * i;
            i++;
        }

        return M;
    }

    public void printFactorialRow(int printToInclusive) {
        int i = 0;

        while (i <= printToInclusive) {
            System.out.println(this.factorial(i));
            i++;
        }
    }
}

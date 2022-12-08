package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int i = 0;
        do {
            System.out.println(i);
            i = i + 2;
        } while (i <= printTillInclusive);
    }
}

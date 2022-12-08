package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0;

        if (multiplyByAndToInclusive > 0) {
            while (i <= multiplyByAndToInclusive) {
                System.out.println(i * multiplyByAndToInclusive);
                i++;
            }
        } else if (multiplyByAndToInclusive < 0) {
            while (i <= (-1 * multiplyByAndToInclusive)) {
                System.out.println(i * multiplyByAndToInclusive);
                i++;
            }
        }
    }
}

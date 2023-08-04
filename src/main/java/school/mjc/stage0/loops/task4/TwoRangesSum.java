package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger then the last");
            return;
        }
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }
        int skip = 0;
        int count = 0;

        for (int i = 1; i <= numberToSkip; i++) {
            skip += i;
        }
        for (int i = numberToSkip + 1; i <= lastInRow; i++) {
            count += i;
        }
        System.out.println("skipped sum is " + skip);
        System.out.println("counted sum is " + count);
    }
}

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private int min;
    private int max;
    public Randoms(int min, int max) {
        this.max = max;
        this.min = min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomsIteratoration();
    }

    public class RandomsIteratoration implements Iterator<Integer> {
        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            random = new Random();
            int randomValue = random.nextInt(max + 1 - min) + min;
            return randomValue;
        }
    }
}
public class Counter {
    public int startingValue;
    public int counter;
    public boolean check;

    public Counter(int startingValue, boolean check) {
        int number = startingValue;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.counter;
    }

    public void increase() {
        this.increase(1);
    }

    public void increase(int increaseAmount) {
        this.counter += increaseAmount;
    }

    public void decrease() {
        this.decrease(1);
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount < 0) {
            // if 0, do nothing
        } else {
            this.counter -= decreaseAmount;
        }
    }
}

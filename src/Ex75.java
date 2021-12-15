public class Ex75 {
    private int value;   // object variable that remembers the value of the counter

    public Ex75(int valueAtStart) {
        this.value = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // write here the code that decrements the value of counter by one
        this.value = value - 1;
    }

    public static void main(String[] args) {
        Ex75 counter = new Ex75(10);
        counter.printValue();

        counter.decrease();
        counter.printValue();
        counter.decrease();
        counter.printValue();

    }
}

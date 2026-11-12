public class Main {
    public static void main (String[] args) {
    System.out.println("Program Start:");
    sayHi();

    int addition = getSum(17800, 3580);
    System.out.println("Result: " + addition);
}

    static int getSum(int x, int y) {
    int sum = x + y;

    return sum;
}

    static void sayHi() {
    System.out.println("Hi");
}
}

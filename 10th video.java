public class Main {
    public static void main(String[] args) {
    int sum = 0;
    int i = 86;
    while(i <= 10000) {
    sum = sum + i;
    i = i + 5;
    }

    System.out.println("Sum is: " + sum);
    }
}


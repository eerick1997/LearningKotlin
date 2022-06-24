import java.util.function.IntBinaryOperator;

interface Lambda {
    int makeSum(int x, int y);
}

public class Example {
    public static void main(String[] args) {
        Lambda lambda = (int x, int y) -> x + y;
        System.out.println(lambda.makeSum(1, 3));
    }
}

//important library to resolve error
import java.lang.Math;


class Numeric<T extends Number> {
    private T num;

    public Numeric(T num) {
        this.num = num;
    }

    public T getNum() {
        return num;
    }


    public double reciprocal() {
        if (num.doubleValue() == 0.0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return 1.0 / num.doubleValue();
    }


    public double fractionalPart() {
        double value = Math.abs(num.doubleValue());
        return value - (long) value;
    }


    public boolean absEqual(Numeric<? extends Number> other) {
        return Math.abs(this.num.doubleValue()) ==
               Math.abs(other.num.doubleValue());
    }
}

public class Main {
    public static void main(String[] args) {
        Numeric<Double> num1 = new Numeric<>(9.76);
        Numeric<Float> num2 = new Numeric<>(-9.76f);
        Numeric<Integer> num3 = new Numeric<>(4);

        System.out.println("Reciprocal: " + num1.reciprocal());
        System.out.println("Fractional: " + num1.fractionalPart());

        System.out.println("Reciprocal (4): " + num3.reciprocal());
        System.out.println("Fractional (4): " + num3.fractionalPart());

        System.out.println("Abs equal? " + num1.absEqual(num2));
    }
}
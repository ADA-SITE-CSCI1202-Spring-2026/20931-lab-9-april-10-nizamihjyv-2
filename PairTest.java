public class PairTest {
    public static void main(String[] args) {
        Pair<String, Integer> student = new Pair<>("Ali", 101);
        Pair<String, Double> product = new Pair<>("Phone", 799.99);

        System.out.println("Student Pair: " + student);
        System.out.println("Product Pair: " + product);

        student.setFirst("Sara");
        student.setSecond(202);

        System.out.println("Updated Student Pair: " + student);

        System.out.println("First value: " + product.getFirst());
        System.out.println("Second value: " + product.getSecond());
    }
}
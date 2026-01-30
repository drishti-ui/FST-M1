package activities;


interface Addable {
    int add(int x, int y);
}

public class Activity12 {
    public static void main(String[] args) {

        Addable add1 = (x, y) -> (x + y);
        System.out.println(add1.add(100, 200));

        // Lambda expression with return keyword.
        Addable add2 = (int x, int y) -> {
            return (x + y);
        };
        System.out.println(add2.add(100, 200));
    }
}
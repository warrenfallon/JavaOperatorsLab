public class AssignmentOperatorsDemo {
    public static void main(String[] args) {
        // Simple assignment
        int a = 5; // Initialize 'a' to 5 directly
        int b = 5; // Initialize 'b' to 5

        // Printing values
        System.out.println("a is: " + a); // should print 5
        System.out.println("b is: " + b); // should print 5

        // Multiple assignments
        int c;
        c = a = 10; // Assign 10 to 'a' and 'c'

        // Printing values
        System.out.println("a is: " + a); // should print 10
        System.out.println("c is: " + c); // should print 10
    }
}

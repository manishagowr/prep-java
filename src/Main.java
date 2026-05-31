public class Main {
    public static void main(String[] args) {
        // Create Student object
        Student student = new Student("Alice Johnson", 85.5, 3.75);

        // Call getters and display student info
        System.out.println(" Student Information ");
        System.out.println("Name: " + student.getName());
        System.out.println("Marks: " + student.getMarks());
        System.out.println("CGPA: " + student.getCGPA());

        // Create BankAccount object
        BankAccount account = new BankAccount(1000.00);

        // Display initial balance
        System.out.println("\n Bank Account ");
        System.out.println("Initial Balance: Rs." + account.getBalance());

        // Call deposit method
        account.deposit(500.00);

        // Call withdraw method
        account.withdraw(200.00);

        // Display final balance
        System.out.println("Final Balance: Rs." + account.getBalance());
    }
}
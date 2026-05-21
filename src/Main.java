import model.Expense;
import service.ExpenseService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ExpenseService service = new ExpenseService();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n1- Add");
            System.out.println("2- List");
            System.out.println("3- Remove");
            System.out.println("0- Exit");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Amount: ");
                    double amount = scanner.nextDouble();

                    service.addExpense(new Expense(id, title, amount));
                    break;

                case 2:
                    service.listExpenses();
                    break;

                case 3:
                    System.out.print("ID: ");
                    int removeId = scanner.nextInt();
                    service.removeExpense(removeId);
                    break;

                case 0:
                    return;
            }
        }
    }
}
